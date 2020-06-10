import java.io.*;

class UserWon implements Serializable {

    private User currentPlayer;

    public UserWon(User currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    /**
     * UserWon toString method.
     * @return formatted winner message
     */
    public String toString() {
        return currentPlayer.getUsername() + " is the winner!";
    }

}
