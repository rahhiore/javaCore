public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;
    public Gryffindor(String name, int nobility, int honor, int courage, int magicPower, int transgressionDistance) {
        super(name, magicPower, transgressionDistance);
        this.courage = courage;
        this.honor = honor;
        this.nobility = nobility;
    }

    public int getCourage() {
        return courage;
    }

    public int getHonor() {
        return honor;
    }

    public int getNobility() {
        return nobility;
    }

}
