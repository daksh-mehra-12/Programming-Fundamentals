import java.util.*;
public class Function_Conversion {
    public static int bintodec(int b , String s) {
        if(b == 0) {
            return 0;
        }
        while(b>0){
            int d = b%10;
            s = d + s;
            b = b/10;
        }
        return Integer.parseInt(s, 2);
    }
    public static String dectonin(int n , String s) {
        if(n == 0) {
            return "0";
        }
        while(n>0){
            int d = n%2;
            s = d + s;
            n = n/2;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        System.out.print("Enter binary Number : ");
        int b = sc.nextInt();
        String s = "";
        System.out.println(bintodec(b, s));
        System.out.println(dectonin(n, s));
        sc.close();
    }
}
