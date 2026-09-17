import java.util.*;
public class username_Creater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.next();
        StringBuilder sb = new StringBuilder(n);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i) == '@'){
                sb.delete(i, sb.length());
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
