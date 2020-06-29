import java.util.*;
import java.util.stream.Collectors;

public class Game {
  /***** attributes: *****/
  List<Player> players;
  List<Space> boardSpaces;
  Map<SpaceType, List<Integer>> spaceTypeToPositionsMap;
  List<Card> cards;
  int currentPlayer;
  int currentCard;

  Game(int numPlayers) {
    initializePlayers(numPlayers);
    initializeBoardSpaces();
    initializeCards();
    shuffleDeck();
    currentPlayer = 0;
    currentCard = 0;
  }

  /***** operations:  *****/
  private void displayTitleScreen()

  private void displayRules()

  private void displayOptions()

  private void initializePlayers(int numPlayers) {
    players = new ArrayList<>();
    for (int i = 0; i < numPlayers; i++) {
      players.add(new Player(i));
    }
  }

  private void initializeBoardSpaces() {
    boardSpaces = List.of(
        new Space(0, SpaceType.RED, 0, 0),
        new Space(1, SpaceType.PURPLE, 0, 0),
        new Space(2, SpaceType.YELLOW, 0, 0),
        new Space(3, SpaceType.BLUE, 0, 0),
        new Space(4, SpaceType.ORANGE, 0, 0),
        new Space(5, SpaceType.GREEN, 0, 0),
        new Space(9, SpaceType.MILK_TEA, 0, 0),
        new Space(18, SpaceType.WALLET, 0, 0),
        new Space(43, SpaceType.CLAPBOARD, 0, 0),
        new Space(75, SpaceType.SANDALS, 0, 0),
        new Space(96, SpaceType.BASKETBALL, 0, 0),
        new Space(104, SpaceType.CAMERA, 0, 0)
        // TODO: add all remaining spaces with image coordinates
    );

    spaceTypeToPositionsMap = boardSpaces.stream()
        .collect(Collectors.groupingBy(
            space -> space.type,
            Collectors.mapping(space -> space.spaceNumber, Collectors.toList())));
  }

  private void initializeCards() {
      /*The Candyland deck consists of 66 cards.
      There are 6 cards representing special locations,
      and 60 cards split into six different colors.
      In each color there are 8 single move cards and 2 double move cards.*/
    cards = List.of(
        new Card(SpaceType.MILK_TEA, 1),
        new Card(SpaceType.WALLET, 1),
        new Card(SpaceType.CLAPBOARD, 1),
        new Card(SpaceType.SANDALS, 1),
        new Card(SpaceType.BASKETBALL, 1),
        new Card(SpaceType.CAMERA, 1)
    );
    cards = new ArrayList<>(cards);
    List.of(SpaceType.RED, SpaceType.ORANGE, SpaceType.PURPLE, SpaceType.YELLOW, SpaceType.BLUE, SpaceType.GREEN)
        .forEach(spaceType -> {
          for (int i = 0; i < 6; i++) {
            cards.add(new Card(spaceType, 1));
          }
          for (int i = 0; i < 2; i++) {
            cards.add(new Card(spaceType, 2));
          }
        });
  }

  private void shuffleDeck() {
    // Fisher-Yates shuffle
    Random rando = new Random();
    for (int i = 1; i < cards.size(); i++) {
      int j = rando.nextInt(i + 1);
      Card temp = cards.get(i);
      cards.set(i, cards.get(j));
      cards.set(j, temp);
    }
  }

  private void displayBoard() {
  }

  private Card drawCard() {
    if (currentCard >= cards.size()) {
      currentCard = 0;
      shuffleDeck();
    }
    return cards.get(currentCard++);
  }

  private Space calcNewSpace(Space curSpace, Card card) {
    List<Integer> positionsForSpaceTypeOfCard = spaceTypeToPositionsMap.get(card.spaceType);
    int spaceIndex = positionsForSpaceTypeOfCard.size() - 1;
    while (spaceIndex >= 0 && positionsForSpaceTypeOfCard.get(spaceIndex) > curSpace.spaceNumber) {
      spaceIndex--;
    }
    int newSpaceIndex = Math.min(spaceIndex + card.multiplier, positionsForSpaceTypeOfCard.size() - 1);
    Integer newSpaceNumber = positionsForSpaceTypeOfCard.get(newSpaceIndex);

    // Handle Walk of Fame
    if (newSpaceNumber == 11) {
        newSpaceNumber = 23;
    } else if (newSpaceNumber == 29) {
        newSpaceNumber = 55;
    }

    return boardSpaces.get(newSpaceNumber);
  }

  private void displayWinner()
}
