package SensitiveDataTagging;

public class UserAccount implements SensitiveData{
	private String username;
    private String password;

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserAccount [username=" + username + ", password=" + password + "]";
    }
}
