import java.util.*;
public class Print_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Table You Want : ");
        int a = sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(a*i);
        }
        sc.close();
    }
}
