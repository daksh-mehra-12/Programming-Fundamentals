import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Choice : ");
        int ch = sc.nextInt();
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        int rem = a%b;
        if(ch==1)
            System.out.println("Addition : "+sum);
        else if(ch==2)
            System.out.println("Subtraction : "+sub);
        else if(ch==3)
            System.out.println("Multiplication : "+mul);
        else if(ch==4)
            System.out.println("Division : "+div);
        else if(ch==5)
            System.out.println("Remender : "+rem);
        else
            System.out.print("INvalid Choice");
        sc.close();
    }
}
