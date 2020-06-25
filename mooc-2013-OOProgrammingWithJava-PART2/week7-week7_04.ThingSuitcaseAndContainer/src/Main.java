public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for(int x = 1; x <= 100; x++){
            Thing brick = new Thing("brick", x);
            Suitcase caser = new Suitcase(x);
            caser.addThing(brick);
            container.addSuitcase(caser);
        }
    }
}