public class Robber extends BaseHero {

  public Robber() {
    super("Stand", 8, 3, 10, 6, new int[] { 2, 4 });
    this.health = 8;
    this.maxHealth = 10;
  }

  @Override
  public String getInfo() {
    return this.getClass() + " " + super.getInfo() + ", " + state;
  }
}
