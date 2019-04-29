package cn.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
--请在用户登录页面进行登录,登录后跳转到首页,同时显示登录的用户名和登录时间.
如果用户名为tom,密码为123则可以登录,否则提示错误信息--
 */
@WebServlet("/login")
public class LoginCookie extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
            Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yy年MM月dd日 hh时mm分ss秒");
        String format = sd.format(date);


        if ("tom".equals(username)&&"123".equals(password)){
            req.getSession().setAttribute("username",username);
            req.getSession().setAttribute("time",format);
            resp.sendRedirect("success.jsp");
        }else{
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().write("用户名或密码错误");

        }
    }
}
