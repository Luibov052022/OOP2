public class Spearman extends BaseHero {

  public Spearman() {
    super("Stand", 4, 5, 10, 4, new int[] { 1, 3 });
    this.health = 4;
    this.maxHealth = 10;
  }

  @Override
  public String getInfo() {
    return this.getClass() + " " + super.getInfo() + ", " + state;
  }
}
