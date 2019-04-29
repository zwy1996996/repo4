package cn.itheima.web.servlet;

import cn.itheima.domain.User;
import cn.itheima.service.UserService;
import cn.itheima.service.imp.UserServiceImp;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("utf-8");
        //获取数据
        //获取用户的验证码
        String verifycode = request.getParameter("verifycode");
        //验证码校验
        HttpSession session = request.getSession();//为什么要获取session
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
       if (!checkcode_server.equalsIgnoreCase(verifycode)){
            request.setAttribute("login_msg","验证码");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
            return;
        }
        //封装user对象(干嘛)
        Map<String, String[]> map = request.getParameterMap();
        User user =new User();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //调用Service查询
        UserService service = new UserServiceImp();
        User loginUser = service.login(user);
        if (loginUser!=null){
            session.setAttribute("user",loginUser);
            response.sendRedirect(request.getContextPath()+"/index.jsp");

        }else{
            request.setAttribute("login_msg","用户名或密码错误!");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
