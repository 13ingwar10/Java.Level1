public class Doggo extends Animals {

    protected int distance;

    public Doggo(String type,String name, String color) {
        super(type,name,color);
    }


    protected void run(int distance) {System.out.printf("%s бежит %d метров\n", name, distance);}

    protected void swim(int distance) {System.out.printf("%s плывет %d метров\n", name, distance);}
}