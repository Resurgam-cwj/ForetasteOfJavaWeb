package myweb.login.DAO;

import com.mysql.cj.protocol.Resultset;
import utils.jdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class resDao {
    public static String successupdate(String type, String fl,String name,String id) {
        try {
            String k =null;
            Connection conn = jdbcUtils.getConn();
            if(type.equalsIgnoreCase("flights")){
                String sql1 = "select flightNum,price,numSeats,numAvail,FromCity,ArivCity from flights where flightNum = ?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1,fl);
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next())
                {
                    if(rs1.getInt("numAvail")>0)
                    {
                        String sql2 = "update flights set numAvail = numAvail-1 where flightNum = ?";
                        PreparedStatement ps2 =conn.prepareStatement(sql2);
                        ps2.setString(1,fl);
                        ps2.executeUpdate();
                        k = resDao2.updatecusandrevkey(name, id, type,fl);
                        return k;
                    }
                }
                return null;
            }
            if(type.equalsIgnoreCase("hotels")){

                String sql3 = "select location,price,numRooms,numAvail from hotels where location = ?";
                PreparedStatement ps3 = conn.prepareStatement(sql3);
                ps3.setString(1,fl);
                ResultSet rs2 = ps3.executeQuery();
                if(rs2.next())
                {
                    if(rs2.getInt("numAvail")>0)
                    {
                        String sql4 = "update hotels set numAvail = numAvail-1 where location = ?";
                        PreparedStatement ps4 =conn.prepareStatement(sql4);
                        ps4.setString(1,fl);
                        ps4.executeUpdate();
                        k =resDao2.updatecusandrevkey(name, id, type,fl);
                        return k;
                    }
                }
                return null;
            }
            if(type.equalsIgnoreCase("bus")){
                String sql5 = "select location,price,numBus,numAvail from bus where location = ?";
                PreparedStatement ps5 = conn.prepareStatement(sql5);
                ps5.setString(1,fl);
                ResultSet rs3 = ps5.executeQuery();
                if(rs3.next())
                {
                    if(rs3.getInt("numAvail")>0)
                    {
                        String sql6 = "update bus set numAvail = numAvail-1 where location = ?";
                        PreparedStatement ps6 =conn.prepareStatement(sql6);
                        ps6.setString(1,fl);
                        ps6.executeUpdate();
                        k = resDao2.updatecusandrevkey(name, id, type,fl);
                        return k;
                    }
                }
                return null;
            }
            return null;
//            String sql = "select location,price,numRooms,numAvail from hotels";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while(rs.next()) {
//                hotel ho = new hotel();
//                ho.setLocation(rs.getString("location"));
//                ho.setPrice(rs.getInt("price"));
//                ho.setNumRooms(rs.getInt("numRooms"));
//                ho.setNumAvail(rs.getInt("numAvail"));
//                hotels.add(ho);
//            }
//            return true ;

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
