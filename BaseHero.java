import java.util.List;

public abstract class BaseHero implements HeroInterface {

  protected String state;
  protected int attack;
  protected int protect;
  protected float health;
  protected float maxHealth = health;
  protected int speed;
  protected int[] damage;
  protected List<BaseHero> gang;

  public BaseHero(
    String state,
    int attack,
    int protect,
    float health,
    int speed,
    int[] damage
  ) {
    this.attack = attack;
    this.damage = damage;
    this.health = health;
    this.state = state;
    this.protect = protect;
    this.speed = speed;
  }

  @Override
  public String getInfo() {
    return (
      "Attack: " +
      attack +
      " Protеct: " +
      protect +
      " Damage: " +
      (damage[0] + damage[1]) /
      2 +
      " Health: " +
      health +
      " Speed: " +
      speed
    );
  }

  @Override
  public void step() {}
}
