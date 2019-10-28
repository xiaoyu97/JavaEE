/**
 * @author edz
 */
public class User {
    private String name;
    private String password;
    private String nickName;

    public User() {
    }

    public User(String name, String password, String nickName) {
        this.name = name;
        this.password = password;
        this.nickName = nickName;
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
