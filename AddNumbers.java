// Adding two numbers.

import java.util.Scanner;

public class AddNumbers {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter first number: ");
          int a = in.nextInt();
          System.out.println("Enter second number: ");
          int b = in.nextInt();
          System.out.println("Sum = " + (a + b));
     }
}
