import java.util.*;
public class Checking_GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        if(a==b){
            System.out.print("Both Are Equal");
        }
        else if(a>b){
            System.out.print("A Is Greater ");
        }
        else{
            System.out.print("B is Greater");
        }
        sc.close();
    }
}
