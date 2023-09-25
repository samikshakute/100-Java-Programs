// Adding two large numbers.

import java.util.Scanner;
import java.math.BigInteger;

public class AddingLargeNumbers {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          String number1, number2;
          System.out.println("Enter first large integer: ");
          number1 = in.nextLine();
          System.out.println("Enter second large integer: ");
          number2 = in.nextLine();
          BigInteger first = new BigInteger(number1);
          BigInteger second = new BigInteger(number2);
          BigInteger sum;
          sum = first.add(second);
          System.out.println("Sum = " + sum);

     }
}
