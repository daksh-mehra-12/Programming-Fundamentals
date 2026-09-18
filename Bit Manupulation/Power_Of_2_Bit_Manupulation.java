import java.util.*;
public class Power_Of_2_Bit_Manupulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        if(n>0 && ((n &(n-1)) ==0)){
            System.out.print("Power Of 2");
        }
        else{
            System.out.println("Not A power Of 2");
        }
        sc.close();
    }
}
