package service;

import domain.User;
import mapper.QueryMapper;

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
     *根据手机号获取数据
     */
    public User getDateP(int phone) {
        QueryMapper queryMapper = new QueryMapper();
        List Users = queryMapper.Query();
        Iterator<User> it = Users.iterator();
        while (it.hasNext()) {
            User u = it.next();
            if (u.getPhone()==phone) {
                return u;
            }
        }
        return null;
    }

    /**
     *
     * 更新数据
     */
    public void UpDate(int phone, int score) {
        QueryMapper queryMapper=new QueryMapper();
        User user= this.getDateP(phone);
        System.out.println(user);
          int score1=user.getScore();
              score1=score1-score;
            queryMapper.UpDate(phone,score1);
    }
}
