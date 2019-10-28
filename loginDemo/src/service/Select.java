//package service;
//
//import domain.User;
//
//import java.sql.*;
//
///**
// * @author edz
// */
//public class Select {
//    private String url = "jdbc:mysql://localhost:3306/cxydb2";
//    private String ruser = "root";
//    private String password = "Root_123";
//
//    public User showUser() {
//        Connection conn = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        User user = null;
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection(url, ruser, password);
//            String sql = "select * from person ";
//            ps = conn.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                String password = rs.getString("password");
//                String name = rs.getString("name");
//                String nickName = rs.getString("nickname");
//                int score=rs.getInt("score");
//
//                user = new User(name, password, nickName,score);
//                return user;
//            }
//            return null;
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//            return null;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            if (rs != null) {
//                try {
//                    rs.close();
//                    ps.close();
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
