package myweb.login.Servlet;

import myweb.login.Customer.customer;
import myweb.login.DAO.customerDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("登录请求已到达");
        request.setCharacterEncoding("utf-8");
        String resvKey = request.getParameter("resvKey");
        System.out.println(resvKey);
        customer cus = customerDao.getCustomerByresvkey(resvKey);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        if(cus == null){
            request.setAttribute("login_msg","Wrong Reservation Key！");
            RequestDispatcher rd =request.getRequestDispatcher("search.jsp");
            rd.forward(request,response);
        }
        if(cus != null){
            HttpSession session = request.getSession();
            session.setAttribute("ResvCustomer",cus);
            request.getRequestDispatcher("main.jsp").forward(request,response);
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);

    }
}
