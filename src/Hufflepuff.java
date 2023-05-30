public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    public Hufflepuff(String name, int hardworking, int loyal, int honest, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.honest = honest;
        this.loyal = loyal;
        this.hardworking = hardworking;
    }

    public int getHonest() {
        return honest;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHardworking() {
        return hardworking;
    }
}
