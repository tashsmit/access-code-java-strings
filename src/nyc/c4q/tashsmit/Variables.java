package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/3/15.
 */
public class Variables {
    public static void main(String[] args) {

        System.out.println("I will now count my chickens:");
        System.out.println("Hens" + (25 + 30 / 6));
        System.out.println("Roosters " + (100 - 25 * 3 % 4));
        System.out.println("Now I will count the eggs:");
        System.out.println(3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6);
        System.out.println("Is it true that 3 + 2 < 5 - 7?");
        System.out.println(3 + 2 < 5 - 7);
        System.out.println("What is 3 + 2? " + (3 +2));
        System.out.println("What is 5 - 7? " + (5 - 7));
        System.out.println("Oh, that's why it's false.");
        System.out.println("How about some more.");
        System.out.println("Is it greater? " + (5 > -2));
        System.out.println("Is it great or equal? " + (5 >= -2));
        System.out.println("Is it less or equal? " + (5 <= -2));

        int strawberries = 2;
        double blueberries = 3.0;
        boolean isOne = strawberries == blueberries;

        System.out.println(isOne);




    }


}
