package myweb.login.DAO;

import myweb.login.FLIGHT.flight;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class flightDaoImpl implements flightDao {
    @Override
    public List<flight> selectAllEmps() {
        List<flight> flights = new ArrayList<flight>();
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select flightNum,price,numSeats,numAvail,FromCity,ArivCity from flights";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                flight fl = new flight();
                fl.setFlightNum(rs.getString("flightNum"));
                fl.setPrice(rs.getInt("price"));
                fl.setNumSeats(rs.getInt("numSeats"));
                fl.setNumAvail(rs.getInt("numAvail"));
                fl.setFromCity(rs.getString("FromCity"));
                fl.setArriveCity(rs.getString("ArivCity"));

                flights.add(fl);
            }
            return flights ;

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
