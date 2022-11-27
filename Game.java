import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

  private static final int GANG_SIZE = 5;

  public static void main(String[] args) {
    //List<BaseHero> units = new ArrayList<>();
    //for (int i = 0; i < 51; i++) {
    //  units.add(getHero());
    //}

    //List result = setFilter(units, "Peasant");
    //result.forEach(n -> System.out.println(n.toString()));
    List<BaseHero> whiteSide = new ArrayList<>();
    List<BaseHero> blackSide = new ArrayList<>();
    while (whiteSide.size() < GANG_SIZE) {
      whiteSide.add(getHero(0, whiteSide));
      blackSide.add(getHero(3, blackSide));
    }
    System.out.println("--НАЧАЛО--");
    System.out.println("whiteSide");
    whiteSide.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("blackSide");
    blackSide.forEach(n -> System.out.println(n.getInfo()));

    System.out.println("После лечения");
    whiteSide.forEach(BaseHero::step);
    blackSide.forEach(BaseHero::step);

    System.out.println("whiteSide");
    whiteSide.forEach(n -> System.out.println(n.getInfo()));
    System.out.println("blackSide");
    blackSide.forEach(n -> System.out.println(n.getInfo()));
  }

  private static BaseHero getHero(int origin, List<BaseHero> side) {
    int num = new Random().nextInt(origin, origin + 4);
    return switch (num) {
      case 0 -> new Robber();
      case 1 -> new Sniper();
      case 2 -> new Wizard(side);
      case 3 -> new Peasant();
      case 4 -> new Spearman();
      case 5 -> new Xbowman();
      default -> new Monk(side);
    };
  }

  private static List setFilter(List<BaseHero> list, String type) {
    List<BaseHero> newList = new ArrayList<>();
    for (BaseHero i : list) {
      if (i.toString().split(" ")[1].equals(type)) {
        newList.add(i);
      }
    }
    return newList;
  }
}
