package myweb.login.DAO;

import myweb.login.BUS.bus;
import myweb.login.FLIGHT.flight;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class busDaoImpl implements busDao {
    @Override
    public List<bus> selectAllEmps() {
        List<bus> buses = new ArrayList<bus>();
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select location,price,numBus,numAvail from bus";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                bus bus = new bus();
                bus.setLocation(rs.getString("location"));
                bus.setPrice(rs.getInt("price"));
                bus.setNumBus(rs.getInt("numBus"));
                bus.setNumAvail(rs.getInt("numAvail"));
                buses.add(bus);
            }
            return buses ;

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
