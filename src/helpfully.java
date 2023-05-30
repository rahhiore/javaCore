import java.util.Random;
public class helpfully {
    public static int getRandomNum() {
        Random rnd = new Random();
        return rnd.nextInt(100);
    }
    public static String suffix(int i) {
        if (i >= 2) {
            return "scores";
        } else if (i == 1 || i == 0) {
            return "score";
        }
        return "Scores";
    }
    public static void print(Gryffindor[] gryffindors, int num) {
        System.out.println(gryffindors[num].getName() + " have " +
                "magicPower = " + gryffindors[num].getMagicPower() + " " + suffix(gryffindors[num].getMagicPower()) +
                ", transgressionDistance = " + gryffindors[num].getTransgressionDistance() + " " + suffix(gryffindors[num].getTransgressionDistance()) +
                ", nobility = " + gryffindors[num].getNobility() + " " + suffix(gryffindors[num].getNobility()) +
                ", honor = " + gryffindors[num].getHonor() + " " + helpfully.suffix(gryffindors[num].getHonor()) +
                ", courage = " + gryffindors[num].getCourage() + " " + helpfully.suffix(gryffindors[num].getCourage()) +
                '.');
    }
    public static void print(Slytherin[] slytherins, int num) {
        System.out.println(slytherins[num].getName() + " have " +
                "magicPower = " + slytherins[num].getMagicPower() + " " + suffix(slytherins[num].getMagicPower()) +
                ", transgressionDistance = " + slytherins[num].getTransgressionDistance() + " " + suffix(slytherins[num].getTransgressionDistance()) +
                ", cunning = " + slytherins[num].getCunning() + " " + suffix(slytherins[num].getCunning()) +
                ", determination = " + slytherins[num].getDetermination() + " " + helpfully.suffix(slytherins[num].getDetermination()) +
                ", ambition = " + slytherins[num].getAmbition() + " " + helpfully.suffix(slytherins[num].getAmbition()) +
                ", resourcefulness = " + slytherins[num].getResourcefulness() + " " + helpfully.suffix(slytherins[num].getResourcefulness()) +
                ", lustForPower = " + slytherins[num].getLustForPower() + " " + helpfully.suffix(slytherins[num].getLustForPower()) +
                '.');
    }
    public static void print(Hufflepuff[] hufflepuffs, int num) {
        System.out.println(hufflepuffs[num].getName() + " have " +
                "magicPower = " + hufflepuffs[num].getMagicPower() + " " + suffix(hufflepuffs[num].getMagicPower()) +
                ", transgressionDistance = " + hufflepuffs[num].getTransgressionDistance() + " " + suffix(hufflepuffs[num].getTransgressionDistance()) +
                ", hardworking = " + hufflepuffs[num].getHardworking() + " " + suffix(hufflepuffs[num].getHardworking()) +
                ", loyal = " + hufflepuffs[num].getLoyal() + " " + helpfully.suffix(hufflepuffs[num].getLoyal()) +
                ", honest = " + hufflepuffs[num].getHonest() + " " + helpfully.suffix(hufflepuffs[num].getHonest()) +
                '.');
    }
    public static void print(Ravenclaw[] ravenclaws, int num) {
        System.out.println(ravenclaws[num].getName() + " have " +
                "magicPower = " + ravenclaws[num].getMagicPower() + " " + suffix(ravenclaws[num].getMagicPower()) +
                ", transgressionDistance = " + ravenclaws[num].getTransgressionDistance() + " " + suffix(ravenclaws[num].getTransgressionDistance()) +
                ", smart = " + ravenclaws[num].getSmart() + " " + suffix(ravenclaws[num].getSmart()) +
                ", witty = " + ravenclaws[num].getWitty() + " " + helpfully.suffix(ravenclaws[num].getWitty()) +
                ", wise = " + ravenclaws[num].getWise() + " " + helpfully.suffix(ravenclaws[num].getWise()) +
                ", fullOfCreativity = " + ravenclaws[num].getFullOfCreativity() + " " + helpfully.suffix(ravenclaws[num].getFullOfCreativity()) +
                '.');
    }
    public static void compare(Gryffindor[] gryffindors, int num1, int num2) {
        System.out.print(gryffindors[num1].getName() + " have " +
                "nobility = " + gryffindors[num1].getNobility() + " " + suffix(gryffindors[num1].getNobility()) +
                ", honor = " + gryffindors[num1].getHonor() + " " + helpfully.suffix(gryffindors[num1].getHonor()) +
                ", courage = " + gryffindors[num1].getCourage() + " " + helpfully.suffix(gryffindors[num1].getCourage()) +
                '.');
        System.out.println(gryffindors[num2].getName() + " have " +
                "nobility = " + gryffindors[num2].getNobility() + " " + suffix(gryffindors[num2].getNobility()) +
                ", honor = " + gryffindors[num2].getHonor() + " " + helpfully.suffix(gryffindors[num2].getHonor()) +
                ", courage = " + gryffindors[num2].getCourage() + " " + helpfully.suffix(gryffindors[num2].getCourage()) +
                '.');
        int firstPers = gryffindors[num1].getNobility() + gryffindors[num1].getHonor() + gryffindors[num1].getCourage();
        int secondPers = gryffindors[num2].getNobility() + gryffindors[num2].getHonor() + gryffindors[num2].getCourage();
        if(firstPers > secondPers) {
            System.out.println(gryffindors[num1] + " is much's Gryffindor than " + gryffindors[num2]);
        } else if (secondPers > firstPers) {
            System.out.println(gryffindors[num2] + " is much's Gryffindor than " + gryffindors[num1]);
        } else {
            System.out.println("They have similar stats");
        }
    }
    public static void compare(Slytherin[] slytherins, int num1, int num2) {
        System.out.print(slytherins[num1].getName() + " have " +
                "cunning = " + slytherins[num1].getCunning() + " " + suffix(slytherins[num1].getCunning()) +
                ", determination = " + slytherins[num1].getDetermination() + " " + helpfully.suffix(slytherins[num1].getDetermination()) +
                ", ambition = " + slytherins[num1].getAmbition() + " " + helpfully.suffix(slytherins[num1].getAmbition()) +
                ", resourcefulness = " + slytherins[num1].getResourcefulness() + " " + helpfully.suffix(slytherins[num1].getResourcefulness()) +
                ", lustForPower = " + slytherins[num1].getLustForPower() + " " + helpfully.suffix(slytherins[num1].getLustForPower()) +
                '.');
        System.out.println(slytherins[num2].getName() + " have " +
                "cunning = " + slytherins[num2].getCunning() + " " + suffix(slytherins[num2].getCunning()) +
                ", determination = " + slytherins[num2].getDetermination() + " " + helpfully.suffix(slytherins[num2].getDetermination()) +
                ", ambition = " + slytherins[num2].getAmbition() + " " + helpfully.suffix(slytherins[num2].getAmbition()) +
                ", resourcefulness = " + slytherins[num2].getResourcefulness() + " " + helpfully.suffix(slytherins[num2].getResourcefulness()) +
                ", lustForPower = " + slytherins[num2].getLustForPower() + " " + helpfully.suffix(slytherins[num2].getLustForPower()) +
                '.');
        int firstPers = slytherins[num1].getDetermination() + slytherins[num1].getAmbition() + slytherins[num1].getCunning()
                + slytherins[num1].getResourcefulness() + slytherins[num1].getLustForPower();
        int secondPers = slytherins[num2].getDetermination() + slytherins[num2].getAmbition() + slytherins[num2].getCunning()
                + slytherins[num2].getResourcefulness() + slytherins[num2].getLustForPower();
        if(firstPers > secondPers) {
            System.out.println(slytherins[num1] + " is much's Slytherin than " + slytherins[num2]);
        } else if (secondPers > firstPers) {
            System.out.println(slytherins[num2] + " is much's Slytherin than " + slytherins[num1]);
        } else {
            System.out.println("They have similar stats");
        }
    }
    public static void compare(Ravenclaw[] ravenclaws, int num1, int num2) {
        System.out.print(ravenclaws[num1].getName() + " have " +
                "smart = " + ravenclaws[num1].getSmart() + " " + suffix(ravenclaws[num1].getSmart()) +
                ", witty = " + ravenclaws[num1].getWitty() + " " + helpfully.suffix(ravenclaws[num1].getWitty()) +
                ", wise = " + ravenclaws[num1].getWise() + " " + helpfully.suffix(ravenclaws[num1].getWise()) +
                ", fullOfCreativity = " + ravenclaws[num1].getFullOfCreativity() + " " + helpfully.suffix(ravenclaws[num1].getFullOfCreativity()) +
                '.');
        System.out.println(ravenclaws[num2].getName() + " have " +
                "smart = " + ravenclaws[num2].getSmart() + " " + suffix(ravenclaws[num2].getSmart()) +
                ", witty = " + ravenclaws[num2].getWitty() + " " + helpfully.suffix(ravenclaws[num2].getWitty()) +
                ", wise = " + ravenclaws[num2].getWise() + " " + helpfully.suffix(ravenclaws[num2].getWise()) +
                ", fullOfCreativity = " + ravenclaws[num2].getFullOfCreativity() + " " + helpfully.suffix(ravenclaws[num2].getFullOfCreativity()) +
                '.');
        int firstPers = ravenclaws[num1].getSmart() + ravenclaws[num1].getWitty() + ravenclaws[num1].getWise()
                + ravenclaws[num1].getFullOfCreativity();
        int secondPers = ravenclaws[num2].getSmart() + ravenclaws[num2].getWitty() + ravenclaws[num2].getWise()
                + ravenclaws[num2].getFullOfCreativity();
        if(firstPers > secondPers) {
            System.out.println(ravenclaws[num1] + " is much's Ravenclaw than " + ravenclaws[num2]);
        } else if (secondPers > firstPers) {
            System.out.println(ravenclaws[num2] + " is much's Ravenclaw than " + ravenclaws[num1]);
        } else {
            System.out.println("They have similar stats");
        }
    }
    public static void compare(Hufflepuff[] hufflepuffs, int num1, int num2) {
        System.out.println(hufflepuffs[num1].getName() + " have " +
                "hardworking = " + hufflepuffs[num1].getHardworking() + " " + suffix(hufflepuffs[num1].getHardworking()) +
                ", loyal = " + hufflepuffs[num1].getLoyal() + " " + helpfully.suffix(hufflepuffs[num1].getLoyal()) +
                ", honest = " + hufflepuffs[num1].getHonest() + " " + helpfully.suffix(hufflepuffs[num1].getHonest()) +
                '.');
        System.out.println(hufflepuffs[num2].getName() + " have " +
                "hardworking = " + hufflepuffs[num2].getHardworking() + " " + suffix(hufflepuffs[num2].getHardworking()) +
                ", loyal = " + hufflepuffs[num2].getLoyal() + " " + helpfully.suffix(hufflepuffs[num2].getLoyal()) +
                ", honest = " + hufflepuffs[num2].getHonest() + " " + helpfully.suffix(hufflepuffs[num2].getHonest()) +
                '.');
        int firstPers = hufflepuffs[num1].getHardworking() + hufflepuffs[num1].getLoyal() + hufflepuffs[num1].getHonest();
        int secondPers = hufflepuffs[num2].getHardworking() + hufflepuffs[num2].getLoyal() + hufflepuffs[num2].getHonest();
        if(firstPers > secondPers) {
            System.out.println(hufflepuffs[num1] + " is much's Hufflepuff than " + hufflepuffs[num2]);
        } else if (secondPers > firstPers) {
            System.out.println(hufflepuffs[num2] + " is much's Hufflepuff than " + hufflepuffs[num1]);
        } else {
            System.out.println("They have similar stats");
        }
    }
    public static void compareHogwarts(Hogwarts[] hogwarts, int num1, int num2) {
        System.out.println(hogwarts[num1].getName() + " have " +
                "transgressionDistance = " + hogwarts[num1].getTransgressionDistance() + suffix(hogwarts[num1].getTransgressionDistance()) +
                ", transgressionDistance = " + hogwarts[num1].getMagicPower() + suffix(hogwarts[num1].getMagicPower()) +
                ".");
        System.out.println(hogwarts[num2].getName() + " have " +
                "transgressionDistance = " + hogwarts[num2].getTransgressionDistance() + suffix(hogwarts[num2].getTransgressionDistance()) +
                ", transgressionDistance = " + hogwarts[num2].getMagicPower() + suffix(hogwarts[num2].getMagicPower()) +
                ".");
        int firstPers = hogwarts[num1].getTransgressionDistance() + hogwarts[num1].getMagicPower();
        int secondPers = hogwarts[num2].getTransgressionDistance() + hogwarts[num2].getMagicPower();
        if(firstPers > secondPers) {
            System.out.println(hogwarts[num1].getName() + " is more powered than " + hogwarts[num2].getName());
        } else if (secondPers > firstPers) {
            System.out.println(hogwarts[num2].getName() + " is more powered than " + hogwarts[num1].getName());
        } else {
            System.out.println("They have similar stats");
        }
    }
}
