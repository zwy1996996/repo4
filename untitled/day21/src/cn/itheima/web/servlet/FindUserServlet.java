package cn.itheima.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        response.setContentType("text/html;charset=utf-8");

        Map<String, Object> map = new HashMap<String, Object>();
        if ("tom".equals(username)){
            map.put("userExsit",true);
            map.put("msg","此用户太受欢迎请换一个");
        }else{
            map.put("userExsit",false);
            map.put("msg","此用户名可以使用");
        }
        //将map
        ObjectMapper mapper = new ObjectMapper();
        //String json = mapper.writeValueAsString(map);
        // response.getWriter().write(json);


        //并且传递给客户端
        mapper.writeValue(response.getWriter(),map);



    }
}
