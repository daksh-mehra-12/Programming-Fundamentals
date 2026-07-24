import java.util.*;
public class Sum_First_N_Natural_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Number : ");
        int a = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=a;i++){
            sum = sum+i;
        }
        System.out.print("Sum Is :"+sum);
        sc.close();
    }
}
