import java.util.List;

public class Monk extends BaseHero {

  private boolean magic;

  public Monk(List<BaseHero> gang) {
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
    BaseHero injured = this.gang.get(0);
    for (BaseHero i : this.gang) {
      if (
        i.maxHealth > i.health &&
        injured.health / injured.maxHealth > i.health / i.maxHealth
      ) {
        injured = i;
      }
    }
    if ((injured.maxHealth - injured.health) > (-1)*this.damage[0]) {
      injured.health = injured.health - this.damage[0];
    } else {
      injured.health = injured.health + (injured.maxHealth - injured.health);
    }
  }
}
