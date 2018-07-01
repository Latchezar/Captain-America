package Creatures;

public class Stats {
    private int stamina = 0;
    private int power = 0;
    private int deffence = 0;

    public Stats(int stamina, int power, int deffence) {
        setStamina(stamina);
        setPower(power);
        setDeffence(deffence);
    }


    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDeffence() {
        return deffence;
    }

    public void setDeffence(int deffence) {
        this.deffence = deffence;
    }
}
