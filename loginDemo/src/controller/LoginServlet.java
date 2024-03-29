package controller;

import domain.User;
import mapper.QueryMapper;
import service.LoginService;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CXY
 * @date 2019-10-27 17:25
 * 描述信息：
 */
@WebServlet("/loginService")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] values = req.getParameterValues("option");
        //获取value的值
        int value = Integer.parseInt(values[0]);
        //获取号码值
        String phones = req.getParameter("phone");
        int phone = Integer.parseInt(phones);
        //传到逻辑层
        LoginService loginService = new LoginService();
        int score = loginService.UpDate(phone, value);

        if (score != -1) {
            User user = loginService.getDateP(phone);

            String msg = "扣分前分数：" + score + ",扣了" + value + "分后，" + user.getName() + "还剩" + user.getScore() + "分！";
            //保存数据
            req.setAttribute("Msg", msg);
            //使用请求转发
            req.getRequestDispatcher("drink.jsp").forward(req, resp);
        } else {
            String msg = "输入的号码：" + phone + "错误！";
            req.setAttribute("Msg", msg);

            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }
}
