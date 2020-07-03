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
  private void displayTitleScreen() {
  }

  private void displayRules() {
  }

  private void displayOptions() {
  }

  private void initializePlayers(int numPlayers) {
    players = new ArrayList<>();
    for (int i = 0; i < numPlayers; i++) {
      players.add(new Player(i));
    }
  }

  private void initializeBoardSpaces() {
    boardSpaces = new ArrayList<>();
    boardSpaces.add(new Space(0, SpaceType.RED, 76, 206));
    boardSpaces.add(new Space(1, SpaceType.PURPLE, 94, 195));
    boardSpaces.add(new Space(2, SpaceType.YELLOW, 112, 185));
    boardSpaces.add(new Space(3, SpaceType.BLUE, 130, 176));
    boardSpaces.add(new Space(4, SpaceType.ORANGE, 148, 166));
    boardSpaces.add(new Space(5, SpaceType.GREEN, 163, 155));
    boardSpaces.add(new Space(6, SpaceType.RED, 182, 146));
    boardSpaces.add(new Space(7, SpaceType.PURPLE, 198, 136));
    boardSpaces.add(new Space(8, SpaceType.MILK_TEA, 215, 125));
    boardSpaces.add(new Space(9, SpaceType.YELLOW, 232, 115));
    boardSpaces.add(new Space(10, SpaceType.BLUE, 249, 106));
    boardSpaces.add(new Space(11, SpaceType.ORANGE, 267, 96));
    boardSpaces.add(new Space(12, SpaceType.GREEN, 283, 84));
    boardSpaces.add(new Space(13, SpaceType.RED, 302, 75));
    boardSpaces.add(new Space(14, SpaceType.PURPLE, 317, 86));
    boardSpaces.add(new Space(15, SpaceType.YELLOW, 334, 94));
    boardSpaces.add(new Space(16, SpaceType.BLUE, 352, 104));
    boardSpaces.add(new Space(17, SpaceType.WALLET, 371, 115));
    boardSpaces.add(new Space(18, SpaceType.ORANGE, 388, 126));
    boardSpaces.add(new Space(19, SpaceType.GREEN, 406, 137));
    boardSpaces.add(new Space(20, SpaceType.RED, 388, 147));
    boardSpaces.add(new Space(21, SpaceType.PURPLE, 371, 156));
    boardSpaces.add(new Space(22, SpaceType.YELLOW, 354, 165));
    boardSpaces.add(new Space(23, SpaceType.BLUE, 336, 176));
    boardSpaces.add(new Space(24, SpaceType.ORANGE, 319, 186));
    boardSpaces.add(new Space(25, SpaceType.GREEN, 300, 196));
    boardSpaces.add(new Space(26, SpaceType.RED, 284, 206));
    boardSpaces.add(new Space(27, SpaceType.PURPLE, 267, 216));
    boardSpaces.add(new Space(28, SpaceType.YELLOW, 250, 223));
    boardSpaces.add(new Space(29, SpaceType.BLUE, 233, 235));
    boardSpaces.add(new Space(30, SpaceType.ORANGE, 216, 246));
    boardSpaces.add(new Space(31, SpaceType.GREEN, 198, 254));
    boardSpaces.add(new Space(32, SpaceType.RED, 182, 265));
    boardSpaces.add(new Space(33, SpaceType.PURPLE, 164, 275));
    boardSpaces.add(new Space(34, SpaceType.YELLOW, 145, 285));
    boardSpaces.add(new Space(35, SpaceType.BLUE, 130, 296));
    boardSpaces.add(new Space(36, SpaceType.ORANGE, 114, 305));
    boardSpaces.add(new Space(37, SpaceType.GREEN, 95, 315));
    boardSpaces.add(new Space(38, SpaceType.RED, 76, 324));
    boardSpaces.add(new Space(39, SpaceType.PURPLE, 95, 335));
    boardSpaces.add(new Space(40, SpaceType.YELLOW, 111, 345));
    boardSpaces.add(new Space(41, SpaceType.BLUE, 129, 357));
    boardSpaces.add(new Space(42, SpaceType.CLAPBOARD, 147, 365));
    boardSpaces.add(new Space(43, SpaceType.ORANGE, 147, 365));
    boardSpaces.add(new Space(44, SpaceType.GREEN, 181, 385));
    boardSpaces.add(new Space(45, SpaceType.RED, 200, 375));
    boardSpaces.add(new Space(46, SpaceType.PURPLE, 215, 366));
    boardSpaces.add(new Space(47, SpaceType.YELLOW, 232, 354));
    boardSpaces.add(new Space(48, SpaceType.BLUE, 250, 345));
    boardSpaces.add(new Space(49, SpaceType.ORANGE, 267, 335));
    boardSpaces.add(new Space(50, SpaceType.GREEN, 284, 324));
    boardSpaces.add(new Space(51, SpaceType.RED, 302, 315));
    boardSpaces.add(new Space(52, SpaceType.PURPLE, 317, 305));
    boardSpaces.add(new Space(53, SpaceType.YELLOW, 334, 293));
    boardSpaces.add(new Space(54, SpaceType.BLUE, 354, 284));
    boardSpaces.add(new Space(55, SpaceType.ORANGE, 371, 276));
    boardSpaces.add(new Space(56, SpaceType.GREEN, 387, 266));
    boardSpaces.add(new Space(57, SpaceType.RED, 407, 256));
    boardSpaces.add(new Space(58, SpaceType.PURPLE, 421, 245));
    boardSpaces.add(new Space(59, SpaceType.YELLOW, 439, 233));
    boardSpaces.add(new Space(60, SpaceType.BLUE, 458, 225));
    boardSpaces.add(new Space(61, SpaceType.ORANGE, 474, 215));
    boardSpaces.add(new Space(62, SpaceType.GREEN, 490, 204));
    boardSpaces.add(new Space(63, SpaceType.RED, 508, 194));
    boardSpaces.add(new Space(64, SpaceType.PURPLE, 525, 202));
    boardSpaces.add(new Space(65, SpaceType.YELLOW, 543, 214));
    boardSpaces.add(new Space(66, SpaceType.BLUE, 562, 224));
    boardSpaces.add(new Space(67, SpaceType.ORANGE, 577, 235));
    boardSpaces.add(new Space(68, SpaceType.GREEN, 597, 246));
    boardSpaces.add(new Space(69, SpaceType.RED, 577, 255));
    boardSpaces.add(new Space(70, SpaceType.PURPLE, 560, 265));
    boardSpaces.add(new Space(71, SpaceType.YELLOW, 541, 274));
    boardSpaces.add(new Space(72, SpaceType.BLUE, 526, 285));
    boardSpaces.add(new Space(73, SpaceType.ORANGE, 509, 295));
    boardSpaces.add(new Space(74, SpaceType.SANDALS, 492, 305));
    boardSpaces.add(new Space(75, SpaceType.GREEN, 474, 314));
    boardSpaces.add(new Space(76, SpaceType.RED, 457, 326));
    boardSpaces.add(new Space(77, SpaceType.PURPLE, 441, 334));
    boardSpaces.add(new Space(78, SpaceType.YELLOW, 422, 343));
    boardSpaces.add(new Space(79, SpaceType.BLUE, 406, 355));
    boardSpaces.add(new Space(80, SpaceType.ORANGE, 389, 366));
    boardSpaces.add(new Space(81, SpaceType.GREEN, 371, 374));
    boardSpaces.add(new Space(82, SpaceType.RED, 355, 386));
    boardSpaces.add(new Space(83, SpaceType.PURPLE, 336, 394));
    boardSpaces.add(new Space(84, SpaceType.YELLOW, 317, 403));
    boardSpaces.add(new Space(85, SpaceType.BLUE, 301, 413));
    boardSpaces.add(new Space(86, SpaceType.ORANGE, 283, 424));
    boardSpaces.add(new Space(87, SpaceType.GREEN, 265, 434));
    boardSpaces.add(new Space(88, SpaceType.RED, 284, 445));
    boardSpaces.add(new Space(89, SpaceType.PURPLE, 301, 454));
    boardSpaces.add(new Space(90, SpaceType.YELLOW, 317, 463));
    boardSpaces.add(new Space(91, SpaceType.BLUE, 335, 475));
    boardSpaces.add(new Space(92, SpaceType.ORANGE, 353, 485));
    boardSpaces.add(new Space(93, SpaceType.GREEN, 369, 494));
    boardSpaces.add(new Space(94, SpaceType.RED, 388, 485));
    boardSpaces.add(new Space(95, SpaceType.BASKETBALL, 405, 473));
    boardSpaces.add(new Space(96, SpaceType.PURPLE, 422, 465));
    boardSpaces.add(new Space(97, SpaceType.YELLOW, 439, 454));
    boardSpaces.add(new Space(98, SpaceType.BLUE, 457, 446));
    boardSpaces.add(new Space(99, SpaceType.ORANGE, 473, 436));
    boardSpaces.add(new Space(100, SpaceType.GREEN, 490, 424));
    boardSpaces.add(new Space(101, SpaceType.RED, 509, 416));
    boardSpaces.add(new Space(102, SpaceType.PURPLE, 525, 405));
    boardSpaces.add(new Space(103, SpaceType.CAMERA, 541, 396));
    boardSpaces.add(new Space(104, SpaceType.YELLOW, 559, 384));
    boardSpaces.add(new Space(105, SpaceType.BLUE, 576, 376));
    boardSpaces.add(new Space(106, SpaceType.ORANGE, 594, 366));
    boardSpaces.add(new Space(107, SpaceType.GREEN, 612, 356));
    boardSpaces.add(new Space(108, SpaceType.RED, 625, 342));
    boardSpaces.add(new Space(109, SpaceType.PURPLE, 645, 334));
    boardSpaces.add(new Space(110, SpaceType.YELLOW, 663, 324));
    boardSpaces.add(new Space(111, SpaceType.BLUE, 679, 316));
    boardSpaces.add(new Space(112, SpaceType.ORANGE, 698, 305));
    boardSpaces.add(new Space(113, SpaceType.GREEN, 714, 295));
    boardSpaces.add(new Space(114, SpaceType.RED, 730, 307));
    boardSpaces.add(new Space(115, SpaceType.PURPLE, 749, 315));
    boardSpaces.add(new Space(116, SpaceType.YELLOW, 766, 325));
    boardSpaces.add(new Space(117, SpaceType.BLUE, 781, 335));
    boardSpaces.add(new Space(118, SpaceType.ORANGE, 800, 346));
    boardSpaces.add(new Space(119, SpaceType.GREEN, 818, 355));
    boardSpaces.add(new Space(120, SpaceType.RED, 802, 367));
    boardSpaces.add(new Space(121, SpaceType.PURPLE, 783, 376));
    boardSpaces.add(new Space(122, SpaceType.YELLOW, 766, 385));
    boardSpaces.add(new Space(123, SpaceType.BLUE, 748, 395));
    boardSpaces.add(new Space(124, SpaceType.ORANGE, 733, 407));
    boardSpaces.add(new Space(125, SpaceType.GREEN, 714, 416));
    boardSpaces.add(new Space(126, SpaceType.RED, 698, 427));
    boardSpaces.add(new Space(127, SpaceType.PURPLE, 680, 435));
    boardSpaces.add(new Space(128, SpaceType.YELLOW, 663, 444));
    boardSpaces.add(new Space(129, SpaceType.BLUE, 645, 454));
    boardSpaces.add(new Space(130, SpaceType.ORANGE, 628, 465));
    boardSpaces.add(new Space(131, SpaceType.GREEN, 612, 474));

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

  private void displayWinner() {
  }
}
