package Jira.Entity;

public class User {

    private final String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            "}";
    }

}


