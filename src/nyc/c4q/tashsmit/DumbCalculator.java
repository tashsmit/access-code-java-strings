package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/5/15.
 */
import java.util.Scanner;

public class DumbCalculator {
    public static void main(String [] args) {
        double firstNum, secondNum, thirdNum, answer;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first number?");
        firstNum = input.nextDouble();

        System.out.println("What is your second number?");
        secondNum = input.nextDouble();

        System.out.println("What is your third number?");
        thirdNum =  input.nextDouble();

        answer = (firstNum + secondNum + thirdNum) / 2;

        System.out.println("( " + firstNum + " + " + secondNum + " + " + thirdNum + " ) /2 = " + answer);
    }
}
