package myweb.login.Servlet;

import myweb.login.BUS.bus;
import myweb.login.Customer.customer;
import myweb.login.DAO.*;
import myweb.login.FLIGHT.flight;
import myweb.login.Hotel.hotel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "updateServlet")
public class updateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String input = request.getParameter("input");
        System.out.println(input);
        if(Integer.parseInt(input)==1)
        {

            //查所有的员工数据.
            flightDao flightDao = new flightDaoImpl();

            List<flight> flights = flightDao.selectAllEmps();
            //转发之前绑定数据

            request.setAttribute("flights", flights);

            //resp.sendRedirect("main.jsp");
            request.getRequestDispatcher("main2.jsp").forward(request, response);
        }
        if(Integer.parseInt(input)==2)
        {
            busDao busdao = new busDaoImpl();
            List<bus> buses = busdao.selectAllEmps();
            request.setAttribute("buses",buses);
            request.getRequestDispatcher("main3.jsp").forward(request,response);
        }
        if(Integer.parseInt(input)==3)
        {
            hotelDao hoteldao = new hotelDaoImpl();
            List<hotel> hotels = hoteldao.selectAllEmps();
            request.setAttribute("hotels",hotels);
            request.getRequestDispatcher("main4.jsp").forward(request,response);
        }
        else
        {
            request.setAttribute("update_msg","输入错误，请您重新输入。");
            RequestDispatcher rd =request.getRequestDispatcher("update.jsp");
            rd.forward(request,response);
        }

//        customer cus = customerDao.getCustomerByresvkey(input);
//        response.setContentType("text/html;charset=utf-8");
//        PrintWriter out = response.getWriter();
//        if(cus == null){
//            request.setAttribute("login_msg","Wrong Reservation Key！");
//            RequestDispatcher rd =request.getRequestDispatcher("search.jsp");
//            rd.forward(request,response);
//        }
//        if(cus != null){
//            HttpSession session = request.getSession();
//            session.setAttribute("ResvCustomer",cus);
//            request.getRequestDispatcher("main.jsp").forward(request,response);
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
