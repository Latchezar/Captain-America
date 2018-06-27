package Powers;

public abstract class Power {
    private  String name;
    private  PowerType powertype;
    private  int baseDamage;


    protected Power(String name, PowerType powertype, int baseDamage) {
        this.name = name;
        this.powertype = powertype;
        this.baseDamage = baseDamage;
    }

    





}
