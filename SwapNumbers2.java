// Swap 2 numbers without using third variable.

import java.util.Scanner;

public class SwapNumbers2 {
     public static void main(String[] args) {
          int x, y, temp;
          Scanner in = new Scanner(System.in);
          System.out.println("Enter x and y: ");
          x = in.nextInt();
          y = in.nextInt();
          System.out.println("Before Swapping:");
          System.out.println("x = " + x + ", y = " + y);
          x = x + y;
          y = x - y;
          x = x - y;
          System.out.println("After Swapping:");
          System.out.println("x = " + x + ", y = " + y);

     }
}
