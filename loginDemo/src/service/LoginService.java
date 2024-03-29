package service;

import domain.User;
import mapper.QueryMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author CXY
 * @date 2019-10-28 10:17
 * 描述信息：逻辑判断
 */
public class LoginService {
    /**
     * 获取登录的数据
     */
    public User getDate(String name) {
        QueryMapper queryMapper = new QueryMapper();
        List Users = queryMapper.Query();
        Iterator<User> it = Users.iterator();
        while (it.hasNext()) {
            User u = it.next();
            if (u.getName().equals(name)) {
                return u;
            }
        }
        return null;
    }

    /**
     *init查询所有电话
     */
    public List getPhone() {
        QueryMapper queryMapper = new QueryMapper();
        List Users = queryMapper.Query();
        Iterator<User> it = Users.iterator();
        List list= new ArrayList();
        while (it.hasNext()) {
            User u = it.next();
            list.add(u.getPhone());
            }
        return list;
        }

    /**
     * 根据手机号获取数据
     */
    public User getDateP(int phone) {
        QueryMapper queryMapper = new QueryMapper();
        List Users = queryMapper.Query();
        Iterator<User> it = Users.iterator();
        while (it.hasNext()) {
            User u = it.next();
            if (u.getPhone() == phone) {
                return u;
            }
        }
        return null;
    }

    /**
     * 更新数据
     */
    public int UpDate(int phone, int score) {
        QueryMapper queryMapper = new QueryMapper();
        User user = this.getDateP(phone);
        if (user != null) {
            int score1 = user.getScore();
            score1 = score1 - score;
            queryMapper.UpDate(phone, score1);
            return user.getScore();
        }
        return -1;
    }
}
