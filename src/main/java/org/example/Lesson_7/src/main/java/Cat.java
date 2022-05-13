public class Cat {

    private String name;
    private int appetite;

    //Exercise 2-4
    private boolean checkSatiety;

    protected void eat(Bowl bowl) {
        if (bowl.getFoodAmount()<appetite) {
            System.out.printf("Not enough food, %s cries now :(\n", name);
            checkSatiety=false;
        } else {
            bowl.decreaseFood(appetite);
            System.out.printf("Cat %s ate %d food and satisfied now, there is %d food left\n", name, appetite,bowl.getFoodAmount());
            checkSatiety=true;
        }

    }
    // End Exercise 2-4

    protected Cat(String name, int appetite, boolean checkSatiety) {
        this.name = name;
        this.appetite=appetite;
    }

    protected boolean getSatiety() {
        return checkSatiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite = "+ appetite +
                '}';
    }
}
