import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side of square : ");
        int side = sc.nextInt();

        int area = side*side;

        System.out.println(area);
    }
    
}
