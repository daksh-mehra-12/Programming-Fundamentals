import java.util.*;
public class Calculator_User_Define {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        System.out.println("Addition : "+sum);
        System.out.println("Subtraction : "+sub);
        System.out.println("Multiplication : "+mul);
        System.out.println("Division : "+div);
        System.out.println("Remender : "+rem);
        sc.close();
    }
}
