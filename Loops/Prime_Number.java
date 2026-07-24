import java.util.*;
public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isprime = true;
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i ==0){
                isprime = false;
            }
        }
        if(isprime){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
