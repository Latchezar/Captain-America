package Powers;

public abstract class Power {
    private  String name;
    private  PowerType powertype;
    private  int powerDamage;

    public Power(String name,PowerType powerType,int baseDamage){
      this.name = name;
      this.powertype = powerType;
      this.powerDamage = baseDamage;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PowerType getPowertype() {
        return powertype;
    }

    public void setPowertype(PowerType powertype) {
        this.powertype = powertype;
    }

    public int getBaseDamage() {
        return powerDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.powerDamage = baseDamage;
    }
}
