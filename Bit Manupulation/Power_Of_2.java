import java.util.*;
public class Power_Of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Not A Power Of 2");
        }
        while(n%2 == 0){
            n = n/2;
        }
        if(n==1){
            System.out.print("Power Of 2");
        }
        else{
            System.out.println("Not A Power Of 2");
        }
        sc.close();
    }
}
