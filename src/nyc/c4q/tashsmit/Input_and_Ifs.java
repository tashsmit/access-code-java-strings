package nyc.c4q.tashsmit;

/**
 * Created by Tasha and Jaellys on 3/5/15.
 *
 * This program using various forms of scanner keyboard input methods.
 */

/*import java.util.Scanner;

public class Input_and_Ifs {

    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please say something.");
        int someNumber = keyboard.nextInt();
        System.out.println(someNumber);


    }
}*/

/*import java.util.Scanner;

public class Input_and_Ifs {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type two words and two numbers:");
        String someValues = keyboard.nextLine();

    }
}*/

import java.util.Scanner;

public class Input_and_Ifs {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);

        int age;
        //String name;
        float salaryRate;

        System.out.println("Hello how old are you");
        age = keyboard.nextInt();

        System.out.println("What is your name?");
        String name = keyboard.nextLine();

        //System.out.println("How much do you make?");
        //salaryRate = keyboard.nextFloat();


    }
}
