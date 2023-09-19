import java.util.Scanner;

public class generateBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the price of pencil : ");
        int pencil = sc.nextInt();

        System.out.print("enter the price of pen : ");
        int pen = sc.nextInt();

        System.out.println("enter the price of erasor");
        int erasor = sc.nextInt();

        int bill = pen+pencil+erasor;

        System.out.println("your bill amount is : 2"+bill);
    }
}
