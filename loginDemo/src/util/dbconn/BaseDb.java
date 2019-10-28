package util.dbconn;

import domain.User;

import java.sql.*;

/**
 * @author CXY
 * @date 2019-10-27 19:54
 * 描述信息：获取和关闭数据库连接
 */
public class BaseDb {

    private String url = "jdbc:mysql://localhost:3306/cxydb2";
    private String ruser = "root";
    private String password = "Root_123";

    /**
     *连接
     */
    public  Connection getConn() {
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, ruser, password);
        }  catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;

    }

    /**
     *
     * 关闭
     */
    public void DBClose(Connection conn,Statement ps,ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            }
            catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            }
            catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            }
            catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}