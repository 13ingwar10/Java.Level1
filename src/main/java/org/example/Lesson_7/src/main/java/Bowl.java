import java.util.Scanner;

public class Bowl {

    private int foodAmount;

    //Exercise 6
    protected void putFood() {
        int amount = -1;
        Scanner scanner = new Scanner(System.in);

        while (amount<0) {
            System.out.println("How many food add to a bowl?");
            amount = scanner.nextInt();
        }

        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is %d now\n", amount, foodAmount);
    }
    //End Exercise 6

    protected void decreaseFood(int amount) {
        this.foodAmount -= amount;
    }

    protected int getFoodAmount() {
        return this.foodAmount;
    }
}
