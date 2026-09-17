import java.util.*;
public class Reverse_String{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.next();
        StringBuilder sb = new StringBuilder(n);
        for(int i=0;i<sb.length()/2;i++){
            int start = i;
            int end = sb.length()-1-i;
            char first = sb.charAt(start);
            char last = sb.charAt(end);

            sb.setCharAt(start, last);
            sb.setCharAt(end, first);
        }
        System.out.print(sb);
        sc.close();
    }
}