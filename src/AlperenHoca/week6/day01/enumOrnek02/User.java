package AlperenHoca.week6.day01.enumOrnek02;

public class User {

    private String username;
    private String password;
    private Erole role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Erole getRole() {
        return role;
    }

    public void setRole(Erole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + getUsername() + '\'' +
                ", password='" + getPassword() + '\'' +
                ", role=" + getRole() +
                '}';
    }
}
