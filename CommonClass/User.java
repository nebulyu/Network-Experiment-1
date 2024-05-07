package CommonClass;

public class User {
    private String userId;
    private String userPassword;
    private String userName;

    public User() {
        super();
    }

    public User(String userId, String userPassword, String userName) {
        super();
        this.userId = userId;
        this.userPassword = userPassword;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userPassword=" + userPassword
                + ", userName=" + userName + "]";
    }

}
