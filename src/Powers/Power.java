package Powers;

public abstract class Power {
    private  String name;
    private  PowerType powertype;
    private  int baseDamage;

    public Power(String name,PowerType powerType,int baseDamage){

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
        return baseDamage;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
