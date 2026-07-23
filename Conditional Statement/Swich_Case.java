import java.util.*;
public class Swich_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namaste");
                break;
            case 3:
                System.out.print("Ram Ram");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}
