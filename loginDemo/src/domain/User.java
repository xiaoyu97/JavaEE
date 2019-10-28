package domain;

/**
 * @author edz
 */
public class User {
    private String name;
    private String password;
    private String nickName;
    private int phone;
    private int score;

    public User() {
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public User(String name, String password, String nickName , int score ,int phone) {
        this.name = name;
        this.password = password;
        this.nickName = nickName;
        this.score=score;
        this.phone=phone;
    }

    public int getScore() {

        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public User(String name, String password) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
