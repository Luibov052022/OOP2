import java.util.List;

public class Wizard extends BaseHero {

  private boolean magic;

  public Wizard(List<BaseHero> gang) {
    super("Stand", 17, 12, 30, 9, new int[] { -5, -5 });
    magic = true;
    super.gang = gang;
  }

  @Override
  public String getInfo() {
    return (
      this.getClass() +
      " " +
      super.getInfo() +
      " magic: " +
      magic +
      ", " +
      state
    );
  }

  @Override
  public void step() {
    BaseHero injured2 = this.gang.get(0);
    for (BaseHero i : this.gang) {
      if (
        i.maxHealth > i.health &&
        injured2.health / injured2.maxHealth > i.health / i.maxHealth
      ) {
        injured2 = i;
      }
    }
    if ((injured2.maxHealth - injured2.health) > (-1)*this.damage[0]) {
      injured2.health = injured2.health - this.damage[0];
    } else {
      injured2.health = injured2.health + (injured2.maxHealth - injured2.health);
    }
  }
}
