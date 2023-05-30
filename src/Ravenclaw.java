public class Ravenclaw extends Hogwarts {
    private int smart;
    private int witty;
    private int wise;
    private int fullOfCreativity;
    public Ravenclaw(String name, int smart, int witty, int wise, int fullOfCreativity, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.wise = wise;
        this.witty = witty;
        this.smart = smart;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getSmart() {
        return smart;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

}
