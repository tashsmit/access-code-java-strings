package nyc.c4q.tashsmit;

/**
 * Created by Tasha And Jaellys on 3/5/15
 *
 *
 * This program calculates your BMI.
 */


import java.util.Scanner;
import java.lang.*;

public class BMI_Calculator {
    public static void main(String [] args) {

        Scanner keyboard = new Scanner(System.in);

        double height, weight, bmi;

        System.out.println("What is your height in m?");
        height = keyboard.nextFloat();

        System.out.println("What is your weight in kg");
        weight = keyboard.nextFloat();

        //bmi = weight / (Math.sqrt(height));

        bmi = weight / (height * height);

        System.out.println("Your bmi is: " + bmi);





    }
}
