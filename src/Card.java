import java.io.File;

public class Card {
  /***** attributes: *****/
  SpaceType spaceType;
  int multiplier;
  File image;

  Card(SpaceType spaceType, int multiplier) {
    this.spaceType = spaceType;
    this.multiplier = multiplier;
    // TODO: load image based on space type and multiplier
  }

  /***** operations:  *****/
  private void display() {}
}
