public class User {
    private String userName;
    private String password;
    private String phone;
    private boolean broker;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(String userName, String password, String phone, boolean broker) {
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.broker = broker;
    }

}
