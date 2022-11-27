public class Sniper extends BaseHero {

  private int shoots;

  public Sniper() {
    super("Stand", 12, 10, 15, 9, new int[] { 8, 10 });
    this.shoots = 32;
  }

  @Override
  public String getInfo() {
    return (
      this.getClass() +
      " " +
      super.getInfo() +
      " Shoots: " +
      shoots +
      ", " +
      state
    );
  }
}
