import java.util.*;
public class toggle_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter pos : ");
        int p = sc.nextInt();
        int bitmass = 1<<p;
        int new_Num = bitmass ^ n;
        System.out.print(new_Num); 
        sc.close();
    }
}
