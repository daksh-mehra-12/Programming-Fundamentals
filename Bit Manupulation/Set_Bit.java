import java.util.*;
public class Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Position : ");
        int p = sc.nextInt();
        int bitmas = 1<<p;
        int new_num = bitmas | n;
        System.out.print(new_num);
        sc.close();
    }
}

