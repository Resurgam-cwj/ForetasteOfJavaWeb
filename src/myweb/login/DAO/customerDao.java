package myweb.login.DAO;

import com.mysql.cj.protocol.Resultset;
import myweb.login.Customer.customer;
import utils.jdbcUtils;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class customerDao {
    public static customer getCustomerByresvkey(String resvkey){
        customer cus = null;
        Connection con= null;
        try {
            con = jdbcUtils.getConn();
            String sql = "select r.custName cname, resvType rtype, custId cid " +
                    "from reservations r, customers c where " +
                    "r.custName = c.custName and r.resvKey = ?";

            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,resvkey);
            ResultSet rs =pre.executeQuery();
            rs.next();
            cus = new customer();
            cus.setCustomerId(rs.getString("cid"));
            cus.setCustomerName(rs.getString("cname"));
            cus.setResvtype(rs.getInt("rtype"));
            cus.setResvkey(resvkey);
            return cus;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                jdbcUtils.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        return null;
    }

}
