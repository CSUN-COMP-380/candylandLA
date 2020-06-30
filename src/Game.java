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
        new Space(6, SpaceType.RED, 0, 0),
        new Space(7, SpaceType.PURPLE, 0, 0),
        new Space(8, SpaceType.MILK_TEA, 0, 0),
        new Space(9, SpaceType.YELLOW, 0, 0),
        new Space(10, SpaceType.BLUE, 0, 0),
        new Space(11, SpaceType.ORANGE, 0, 0),
        new Space(12, SpaceType.GREEN, 0, 0),
        new Space(13, SpaceType.RED, 0, 0),
        new Space(14, SpaceType.PURPLE, 0, 0),
        new Space(15, SpaceType.YELLOW, 0, 0),
        new Space(16, SpaceType.BLUE, 0, 0),
        new Space(17, SpaceType.WALLET, 0, 0),
        new Space(18, SpaceType.ORANGE, 0, 0),
        new Space(19, SpaceType.GREEN, 0, 0),
        new Space(20, SpaceType.RED, 0, 0),
        new Space(21, SpaceType.PURPLE, 0, 0),
        new Space(22, SpaceType.YELLOW, 0, 0),
        new Space(23, SpaceType.BLUE, 0, 0),
        new Space(24, SpaceType.ORANGE, 0, 0),
        new Space(25, SpaceType.GREEN, 0, 0),
        new Space(26, SpaceType.RED, 0, 0),
        new Space(27, SpaceType.PURPLE, 0, 0),
        new Space(28, SpaceType.YELLOW, 0, 0),
        new Space(29, SpaceType.BLUE, 0, 0),
        new Space(30, SpaceType.ORANGE, 0, 0),
        new Space(31, SpaceType.GREEN, 0, 0),
        new Space(32, SpaceType.RED, 0, 0),
        new Space(33, SpaceType.PURPLE, 0, 0),
        new Space(34, SpaceType.YELLOW, 0, 0),
        new Space(35, SpaceType.BLUE, 0, 0),
        new Space(36, SpaceType.ORANGE, 0, 0),
        new Space(37, SpaceType.GREEN, 0, 0),
        new Space(38, SpaceType.RED, 0, 0),
        new Space(39, SpaceType.PURPLE, 0, 0),
        new Space(40, SpaceType.YELLOW, 0, 0),
        new Space(41, SpaceType.BLUE, 0, 0),
        new Space(42, SpaceType.CLAPBOARD, 0, 0),
        new Space(43, SpaceType.ORANGE, 0, 0),
        new Space(44, SpaceType.GREEN, 0, 0),
        new Space(45, SpaceType.RED, 0, 0),
        new Space(46, SpaceType.PURPLE, 0, 0),
        new Space(47, SpaceType.YELLOW, 0, 0),
        new Space(48, SpaceType.BLUE, 0, 0),
        new Space(49, SpaceType.ORANGE, 0, 0),
        new Space(50, SpaceType.GREEN, 0, 0),
        new Space(51, SpaceType.RED, 0, 0),
        new Space(52, SpaceType.PURPLE, 0, 0),
        new Space(53, SpaceType.YELLOW, 0, 0),
        new Space(54, SpaceType.BLUE, 0, 0),
        new Space(55, SpaceType.ORANGE, 0, 0),
        new Space(56, SpaceType.GREEN, 0, 0),
        new Space(57, SpaceType.RED, 0, 0),
        new Space(58, SpaceType.PURPLE, 0, 0),
        new Space(59, SpaceType.YELLOW, 0, 0),
        new Space(60, SpaceType.BLUE, 0, 0),
        new Space(61, SpaceType.ORANGE, 0, 0),
        new Space(62, SpaceType.GREEN, 0, 0),
        new Space(63, SpaceType.RED, 0, 0),
        new Space(64, SpaceType.PURPLE, 0, 0),
        new Space(65, SpaceType.YELLOW, 0, 0),
        new Space(66, SpaceType.BLUE, 0, 0),
        new Space(67, SpaceType.ORANGE, 0, 0),
        new Space(68, SpaceType.GREEN, 0, 0),
        new Space(69, SpaceType.RED, 0, 0),
        new Space(70, SpaceType.PURPLE, 0, 0),
        new Space(71, SpaceType.YELLOW, 0, 0),
        new Space(72, SpaceType.BLUE, 0, 0),
        new Space(73, SpaceType.ORANGE, 0, 0),
        new Space(74, SpaceType.SANDALS, 0, 0),
        new Space(75, SpaceType.GREEN, 0, 0),
        new Space(76, SpaceType.RED, 0, 0),
        new Space(77, SpaceType.PURPLE, 0, 0),
        new Space(78, SpaceType.YELLOW, 0, 0),
        new Space(79, SpaceType.BLUE, 0, 0),
        new Space(80, SpaceType.ORANGE, 0, 0),
        new Space(81, SpaceType.GREEN, 0, 0),
        new Space(82, SpaceType.RED, 0, 0),
        new Space(83, SpaceType.PURPLE, 0, 0),
        new Space(84, SpaceType.YELLOW, 0, 0),
        new Space(85, SpaceType.BLUE, 0, 0),
        new Space(86, SpaceType.ORANGE, 0, 0),
        new Space(87, SpaceType.GREEN, 0, 0),
        new Space(88, SpaceType.RED, 0, 0),
        new Space(89, SpaceType.PURPLE, 0, 0),
        new Space(90, SpaceType.YELLOW, 0, 0),
        new Space(91, SpaceType.BLUE, 0, 0),
        new Space(92, SpaceType.ORANGE, 0, 0),
        new Space(93, SpaceType.GREEN, 0, 0),
        new Space(94, SpaceType.RED, 0, 0),
        new Space(95, SpaceType.BASKETBALL, 0, 0),
        new Space(96, SpaceType.PURPLE, 0, 0),
        new Space(97, SpaceType.YELLOW, 0, 0),
        new Space(98, SpaceType.BLUE, 0, 0),
        new Space(99, SpaceType.ORANGE, 0, 0),
        new Space(100, SpaceType.GREEN, 0, 0),
        new Space(101, SpaceType.RED, 0, 0),
        new Space(102, SpaceType.PURPLE, 0, 0),
        new Space(103, SpaceType.CAMERA, 0, 0)
        new Space(104, SpaceType.YELLOW, 0, 0),
        new Space(105, SpaceType.BLUE, 0, 0),
        new Space(106, SpaceType.ORANGE, 0, 0),
        new Space(107, SpaceType.GREEN, 0, 0), 
        new Space(108, SpaceType.RED, 0, 0),
        new Space(109, SpaceType.PURPLE, 0, 0),
        new Space(110, SpaceType.YELLOW, 0, 0),
        new Space(111, SpaceType.BLUE, 0, 0),
        new Space(112, SpaceType.ORANGE, 0, 0),
        new Space(113, SpaceType.GREEN, 0, 0),
        new Space(114, SpaceType.RED, 0, 0),
        new Space(115, SpaceType.PURPLE, 0, 0),
        new Space(116, SpaceType.YELLOW, 0, 0),
        new Space(117, SpaceType.BLUE, 0, 0),
        new Space(118, SpaceType.ORANGE, 0, 0),
        new Space(119, SpaceType.GREEN, 0, 0),
        new Space(120, SpaceType.RED, 0, 0),
        new Space(121, SpaceType.PURPLE, 0, 0),
        new Space(122, SpaceType.YELLOW, 0, 0),
        new Space(123, SpaceType.BLUE, 0, 0),
        new Space(124, SpaceType.ORANGE, 0, 0),
        new Space(125, SpaceType.GREEN, 0, 0),
        new Space(126, SpaceType.RED, 0, 0),
        new Space(127, SpaceType.PURPLE, 0, 0),
        new Space(128, SpaceType.YELLOW, 0, 0),
        new Space(129, SpaceType.BLUE, 0, 0),
        new Space(130, SpaceType.ORANGE, 0, 0),
        new Space(131, SpaceType.GREEN, 0, 0),
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
