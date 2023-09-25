// Finding largest of three numbers

import java.util.Scanner;

public class LargestOfThreeNumbers {
     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter three numbers: ");
          int a = in.nextInt();
          int b = in.nextInt();
          int c = in.nextInt();
          if (a > b && a > c) {
               System.out.println("First number is the largest");
          } else if (b > a && b > c) {
               System.out.println("Second number is the largest");
          } else {
               System.out.println("Third number is the largest");
          }
     }
}
