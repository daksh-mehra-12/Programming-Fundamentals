import java.util.*;
public class Get_Bit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number You Want : ");
        int n = sc.nextInt();
        System.out.print("Enter Position : ");
        int p = sc.nextInt();
        int bitmask = 1<<p;
        if((bitmask & n) == 0){
            System.out.print("Bit Is 0");
        }
        else{
            System.out.println("Bit Is 1");
        }
        sc.close();
    }
}