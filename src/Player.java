import java.io.File;

public class Player {
    /***** attributes: *****/
    int playerNumber;
    int currentSpace;
    File image;

    Player(int playerNumber) {
        this.playerNumber = playerNumber;
        currentSpace = 0;
        // TODO: load image path based on player number
    }
    /***** operations:  *****/
    private void move(Space space){
        currentSpace = space.spaceNumber;
    }
}
