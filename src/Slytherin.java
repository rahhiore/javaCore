public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.ambition = ambition;
        this.determination = determination;
        this.cunning = cunning;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public int getCunning() {
        return cunning;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }


}
