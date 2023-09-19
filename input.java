import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println("welcome "+name);

        int num = obj.nextInt();
        System.out.println(num);

        boolean bool = obj.nextBoolean();
        System.out.println(bool);        
    }    
}
