package mapper;

import domain.User;
import util.dbconn.BaseDb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CXY
 * @date 2019-10-27 20:14
 * 描述信息：数据库交互
 */
public class QueryMapper {
    /**
     * 查询方法
     */
    public List Query() {
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;

        BaseDb db = new BaseDb();
        db.getConn();
        try {
            Connection conn = db.getConn();
            String sql = "select * from person ";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List list = new ArrayList();
            while (rs.next()) {
                String password = rs.getString("password");
                String name = rs.getString("name");
                String nickName = rs.getString("nickname");
                int score=rs.getInt("score");
                int phone=rs.getInt("phone");
                user = new User(name, password, nickName ,score,phone);
                list.add(user);
            }
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
            return null ;
        }
    }

    /**
     * 更新
     */
    public void UpDate(int phone, int score){

        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        BaseDb db = new BaseDb();
        db.getConn();

        try {
            Connection conn = db.getConn();
        String sql = "update person set score=? where phone=? ";
        ps = conn.prepareStatement(sql);
        ps.setObject(1,score);
        ps.setObject(2,phone);
        ps.executeUpdate();
        this.Query();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}