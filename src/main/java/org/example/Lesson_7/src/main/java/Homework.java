public class Homework {

    public static void main(String[] args) {

//Exercise 5
        Cat[] cat = new Cat[5];
        cat[0] = new Cat("Oskar", 30,false);
        cat[1] = new Cat("Murzik", 35,false);
        cat[2] = new Cat("Manya", 15,false);
        cat[3] = new Cat("Fat Boy", 50,false);
        cat[4] = new Cat("Umka", 20,false);

        System.out.println(cat.length + " cats were born");

        Bowl bowl = new Bowl();

        bowl.putFood();

        for (int i = 0; i<cat.length; i++) {
            cat[i].eat(bowl);
        }

        int counter=0;
        for (int i = 0; i<cat.length; i++) {
            if (cat[i].getSatiety() == false) {
                counter++;
            }
        }

        switch (counter) {
            case 0:
                System.out.println("After dinner all cats are satisfied. Well done!");
                break;
            case 1:
                System.out.println("After dinner one cat is dying from starvation");
                break;
            default:
                System.out.println("After dinner "+counter+" cats are dying from starvation");
        }
//End Exercise 5
    }
}
