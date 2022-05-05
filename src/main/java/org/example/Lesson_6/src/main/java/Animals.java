public class Animals {
    protected String type;
    protected String name;
    protected String color;
    protected int distance;

    public Animals() {
        super();
        System.out.printf("Animal born\n");
    }
    public Animals(String type,String name, String color) {
        this();
        this.type = type;
        this.name = name;
        this.color = color;
    }

    protected void run(int distance) {System.out.printf("%s бежит %d метров\n", name, distance);}

    protected void swim(int distance) {System.out.printf("%s плывет %d метров\n", name, distance);}

}
