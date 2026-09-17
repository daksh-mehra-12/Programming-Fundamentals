import java.util.*;
public class Replace_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.nextLine();
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0;i<sb.length();i++){
            if(sb.charAt(i) == 'e'){
                sb.setCharAt(i, 'i');
            }
        }
        System.out.print(sb);
        sc.close();
    }
}
