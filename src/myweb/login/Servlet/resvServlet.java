package myweb.login.Servlet;

import myweb.login.DAO.resDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "resvServlet")
public class resvServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        String fl = request.getParameter("fl");
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String  KEY = resDao.successupdate(type,fl,name,id);
        if(KEY !=null)
        {
            request.setAttribute("resv_msg","预约成功");
            request.setAttribute("key_msg","您的reserve key是： "+KEY);
            RequestDispatcher rd =request.getRequestDispatcher("resv.jsp");
            rd.forward(request,response);
        }
        else
        {
            request.setAttribute("resv_msg","预约失败");
            RequestDispatcher rd =request.getRequestDispatcher("resv.jsp");
            rd.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
