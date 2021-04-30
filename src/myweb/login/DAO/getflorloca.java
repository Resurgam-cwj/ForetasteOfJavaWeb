package myweb.login.DAO;

import myweb.login.FLIGHT.flight;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class getflorloca {

    public static List<String> selectAllflorloca(String name) {
        List<String> florloca = new ArrayList<String>();
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select florloca from reservations where custName = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String str;
                str = rs.getString("florloca");
                florloca.add(str);
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
