package myweb.login.DAO;

import myweb.login.BUS.bus;
import myweb.login.Hotel.hotel;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class hotelDaoImpl implements hotelDao {
    @Override
    public List<hotel> selectAllEmps() {
        List<hotel> hotels = new ArrayList<hotel>();
        try {
            Connection conn = jdbcUtils.getConn();
            String sql = "select location,price,numRooms,numAvail from hotels";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                hotel ho = new hotel();
                ho.setLocation(rs.getString("location"));
                ho.setPrice(rs.getInt("price"));
                ho.setNumRooms(rs.getInt("numRooms"));
                ho.setNumAvail(rs.getInt("numAvail"));
                hotels.add(ho);
            }
            return hotels ;

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
