public class Peasant extends BaseHero {

  private boolean delievery;

  public Peasant() {
    super("Stand", 1, 1, 1, 3, new int[] { 1, 1 });
    delievery = true;
  }

  @Override
  public String getInfo() {
    return (
      this.getClass() +
      " " +
      super.getInfo() +
      " delievery: " +
      delievery +
      ", " +
      state
    );
  }
}
