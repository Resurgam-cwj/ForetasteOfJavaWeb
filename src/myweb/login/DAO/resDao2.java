package myweb.login.DAO;

import myweb.login.Customer.customer;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class resDao2 {
    public static String updatecusandrevkey(String name, String id, String type,String fl)
    {
        Connection con= null;
        try {
            con = jdbcUtils.getConn();
            String sql = "select * from customers where custName = ?";

            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1,name);
            ResultSet rs =pre.executeQuery();
            if(!rs.next()){
                String sql2 = "insert into customers(custName,custID) values(?,?)";
                PreparedStatement pre1 = con.prepareStatement(sql2);
                pre1.setString(1,name);
                pre1.setString(2,id);
                pre1.executeUpdate();
            }
            Random rand = new Random();
            int k = rand.nextInt(100000)+1000;
            int ty=0;
            if(type.equalsIgnoreCase("flights"))ty=1;
            if(type.equalsIgnoreCase("hotels"))ty=2;
            if(type.equalsIgnoreCase("bus"))ty=3;


            String newkey = String.valueOf(k);
            String sql3 = "insert into reservations(resvKey,resvType,custName,florloca) values(?,?,?,?)";
            PreparedStatement pre2 = con.prepareStatement(sql3);
            pre2.setString(1,newkey);System.out.println(k);
            pre2.setInt(2,ty);System.out.println(k);
            pre2.setString(3,name);
            pre2.setString(4,fl);
            pre2.executeUpdate();
            return newkey;

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                jdbcUtils.closeConn();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return  null;
    }
}
