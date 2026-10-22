public class UserBean {
    private String password;

    public UserBean() {}

    // Write-only property: setter is provided, getter is intentionally omitted.
    public void setPassword(String password) {
        this.password = password;
        System.out.println("Password has been set successfully.");
    }

    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setPassword("MySecret123");
    }
}
