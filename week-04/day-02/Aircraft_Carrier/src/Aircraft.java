public class Aircraft {

  protected String type;
  protected int ammo;
  protected int maxAmmo;
  protected int baseDamage;
  protected boolean priority;

  public Aircraft(String type, int maxAmmo, int baseDamage, boolean priority){
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.priority = priority;
    this.ammo = 0;
  }


  public int fight(){
    int damage = this.ammo * this.baseDamage;
    this.ammo = 0;
    return damage;
  }

  public int refill(int ammoStock){
    if (ammoStock >= (this.maxAmmo - this.ammo)){
      ammoStock -= (this.maxAmmo - this.ammo);
      this.ammo = this.maxAmmo;
    } else {
      this.ammo = ammoStock;
      ammoStock = 0;
    }
    return ammoStock;
  }

  public String getType() {
    return this.type;
  }

  public String getStatus() {
    return ("Type " + this.type + ", Ammo: " + this.ammo + ", Base Damage: " + this.baseDamage
            + ", All damage: " + this.ammo * this.baseDamage);
  }

  public boolean isPriority(){
    return priority;
  }

}
