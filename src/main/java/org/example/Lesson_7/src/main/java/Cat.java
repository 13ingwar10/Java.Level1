public class Cat {

    private String name;
    private int appetite;
    private boolean checkSatiety;

    protected Cat(String name, int appetite, boolean checkSatiety) {
        this.name = name;
        this.appetite=appetite;
    }

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
