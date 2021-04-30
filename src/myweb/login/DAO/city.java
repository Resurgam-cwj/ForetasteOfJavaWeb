package myweb.login.DAO;

import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class city {
    public static String selectfromcity(String flightnum) {
        String florloca = null;
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select FromCity from flights where flightNum = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,flightnum);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                florloca = rs.getString("FromCity");
            }
            return florloca ;

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
    public static String selectarivcity(String flightnum) {
        String florloca = null;
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select ArivCity from flights where flightNum = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,flightnum);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                florloca = rs.getString("ArivCity");
            }
            return florloca ;

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
