package myweb.login.Servlet;

import myweb.login.DAO.city;
import myweb.login.DAO.getflorloca;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "routeServlet")
public class routeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String custNAME = request.getParameter("custNAME");
        List<String> city0 = new ArrayList<String>();
        List<String> list = getflorloca.selectAllflorloca(custNAME);
        if(!list.isEmpty())
        {

            for (int i = 0, size = list.size(); i < size; i++) {
                String value = list.get(i);
                city0.add(city.selectfromcity(value));
                city0.add(city.selectarivcity(value));
            }
            int k =0;
            LinkedList<String> l = new LinkedList<String>();
            l.add(city0.get(0));
            l.add(city0.get(1));
            String flag = "旅行线路是完整的。";
            for(int j =2;j<city0.size();j=j+2)
            {
                if(!l.getLast().equals(city0.get(j)))
                {
                    System.out.println(l.getLast());
                    System.out.println(city0.get(j));
                    flag = "旅行线路不是完整的。";
                    break;
                }
                else
                {
                    l.add(city0.get(j));
                    l.add(city0.get(j+1));
                }
            }
            request.setAttribute("city",city0);
            request.setAttribute("flag",flag);
            request.getRequestDispatcher("CITY.jsp").forward(request,response);
        }
        else{
            request.setAttribute("route_msg","不存在此用户！");
            RequestDispatcher rd =request.getRequestDispatcher("route.jsp");
            rd.forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
