package entity;

/**
 * @author RTS
 * @Date 2019/10/15 15:28
 * 注释的内容
 */
public class User {
    private String userName;
    private String Pwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public User(String userName, String pwd) {
        this.userName = userName;
        Pwd = pwd;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", Pwd='" + Pwd + '\'' +
                '}';
    }
}
