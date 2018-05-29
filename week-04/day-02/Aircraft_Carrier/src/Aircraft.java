public class Aircraft {

  protected String type;
  protected int ammo;
  protected int maxAmmo;
  protected int baseDamage;

  public Aircraft(String type){
    this.type = type;
  }

  public int fight(){
    int damage = this.ammo * this.baseDamage;
    this.ammo = 0;
    return damage;
  }

  
}
