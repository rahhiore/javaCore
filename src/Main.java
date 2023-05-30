public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Harry Potter", helpfully.getRandomNum(), helpfully.getRandomNum(),
                helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum()),
                new Gryffindor("Hermione Granger", helpfully.getRandomNum(), helpfully.getRandomNum(),
                helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum()),
                new Gryffindor("Ronald Weasley", helpfully.getRandomNum(), helpfully.getRandomNum(),
                helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum()),
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum()),
                new Slytherin("Graham Montegue", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum()),
                new Slytherin("Gregory Goyle", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum())
        };
        Hufflepuff[] hufflepuffs = {
                new  Hufflepuff("Zacharias Smith", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum()),
                new  Hufflepuff("Cedric Digorry", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum()),
                new  Hufflepuff("Justin Finch", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum())
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Cho Chang", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum()),
                new Ravenclaw("Padma Patil", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum()),
                new Ravenclaw("Marcus Belby", helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum(), helpfully.getRandomNum(), helpfully.getRandomNum(),
                        helpfully.getRandomNum())
        };
        Hogwarts[] hogwarts = {gryffindors[0], gryffindors[1], gryffindors[2], slytherins[0], slytherins[1], slytherins[2],
        hufflepuffs[0], hufflepuffs[1], hufflepuffs[2], ravenclaws[0], ravenclaws[1], ravenclaws[2]};

        System.out.println("------------------------------------------------------------------------------------------------");
        helpfully.print(hufflepuffs, 1);
        System.out.println("------------------------------------------------------------------------------------------------");
        helpfully.compare(gryffindors,0, 2);
        System.out.println("------------------------------------------------------------------------------------------------");
        helpfully.compareHogwarts(hogwarts, 5, 7);
        System.out.println("------------------------------------------------------------------------------------------------");

    }
}
