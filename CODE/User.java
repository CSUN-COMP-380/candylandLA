import java.io.*;

public class User implements Serializable {

    private String username;
    private int userScore;

    public User (String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setScore(int userScore) {
        this.userScore = userScore;
    }
    
}
