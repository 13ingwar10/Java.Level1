import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {

        Animals[] animals = {
           new Cat("Cat","Oskar", "Grey"),
           new Doggo("Doggo","Luka", "Black")
        };

        System.out.println("Всего родилось " + animals.length + " животных");

        Scanner scanner = new Scanner(System.in);
        int distance = -1;
        while (distance <0) {
            System.out.println("Сколько метров бежать животным: ");
            distance = scanner.nextInt();
        }

        for (int i = 0; i < animals.length; i++) {
            if (distance > 500) {
                System.out.println("Животные не могут столько бегать");
                break;
            } else if (distance>200 && distance<500 && animals[i].type == "Cat") {
                System.out.printf("Котик %s пробежал 200 метров и устал\n",animals[i].name);
            } else if (distance>0) {
                animals[i].run(distance);
            }
        }

        distance = -1;
        while (distance <0) {
            System.out.println("Сколько метров плыть животным: ");
            distance = scanner.nextInt();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].type == "Cat") {
                System.out.println("Котики не могут плавать :(");
            } else if (distance>10) {
                System.out.println("Собачки не могут столько плыть");
            } else if (distance>0) {
                animals[i].swim(distance);
            }
        }


        //        for (int i = 0; i < animals.length; i++) {
//            System.out.println(animals[i].getClass());
//        }

        //        for (int i = 0; i < animals.length; i++) {
//            if (distance > 500) {
//                System.out.println("Животные не могут столько бегать");
//            } else if (distance>200 && distance<500 && animals[i].getClass() == Cat) {
//                System.out.printf("Котик %s пробежал 200 метров и устал\n",animals[i].name);
//            } else {
//                animals[i].run(distance);
//            }
//        }

//        for (int i = 0; i < animals.length; i++) {
//            if (animals[i].getClass() == Cat) {
//                System.out.println("Котики не умеют плавать :(");
//            } else if (distance > 10) {
//                System.out.printf("Собачка %s не может столько плыть\n",animals[i].name);
//            } animals[i].swim(distance);
//        }


    }


}
