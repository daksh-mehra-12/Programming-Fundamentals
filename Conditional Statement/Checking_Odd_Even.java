import java.util.*;
public class Checking_Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n%2 ==0){
            System.out.print("Number Is Even");
        }
        else{
            System.out.print("Number Is Odd");
        }
        sc.close();
    }
}
