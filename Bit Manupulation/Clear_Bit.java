import java.util.*;
public class Clear_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter Position : ");
        int p = sc.nextInt();
        int bitmas = 1<<p;
        int not_bit = ~(bitmas);
        int new_num = not_bit & n;
        System.out.println(new_num);
        sc.close();
    }
}
