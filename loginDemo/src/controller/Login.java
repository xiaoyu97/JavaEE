package controller;

import domain.User;
import service.LoginService;
//import service.Select;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author edz
 */
@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        LoginService loginService = new LoginService();
        List phones = loginService.getPhone();
        System.out.println("============");
        System.out.println(phones);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost=====");
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        LoginService loginService = new LoginService();
        User user = loginService.getDate(name);
        if (user != null) {
            if (name.equals(user.getName()) && password.equals(user.getPassword())) {
                String msg = "欢迎" + name + "，昵称：" + user.getNickName() + "，下午好！";
                //保存数据
                req.setAttribute("Msg", msg);
                //使用请求转发
                req.getRequestDispatcher("success.jsp").forward(req, resp);

            }  else if (!password.equals(user.getPassword())) {
                String msg = "输入的密码：" + password + "错误！";
                req.setAttribute("Msg", msg);
                req.getRequestDispatcher("error.jsp").forward(req, resp);
            }
        }else {
            String msg = "输入的用户名：" + name + "错误！";
            req.setAttribute("Msg", msg);
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}
