// program to find of 3 numbers

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
         Scanner  Sc = new Scanner(System.in);

         int a = Sc.nextInt();
         int b = Sc.nextInt();
         int c = Sc.nextInt();

         int avg = (a+b+c)/3;

         System.out.println(avg);

    }
}
