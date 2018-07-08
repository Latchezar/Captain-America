package Creatures;

public class Stats {
    private int stamina = 0;
    private int power = 0;
    private int deffence = 0;


    public Stats(int stamina, int power, int deffence){
        setStamina(stamina);
        setPower(power);
        setDeffence(deffence);
    }

    public Stats(Race race, int stamina, int power, int deffence) {
        setHeroStats(race, stamina, power, deffence);
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

    private void setHeroStats(Race race, int stamina, int power, int deffence) {
        switch (race) {
            case HUMAN:
                stamina += 1;
                power += 2;
                deffence += 1;
                break;
            case ORC:
                stamina += 2;
                power += 1;
                deffence += 1;
                break;
            case UNDEAD:
                stamina += 2;
                power += 2;
                break;
            case ELF:
                stamina += 2;
                power += 2;
                break;
            case TROLL:
                power += 3;
                deffence += 1;
                break;
            case DWARF:
                stamina+=2;
                power+=1;
                deffence+=1;
                break;
        }
        setStamina(stamina);
        setPower(power);
        setDeffence(deffence);
    }
}
