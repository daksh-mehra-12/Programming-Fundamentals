import java.util.*;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.nextLine();
        String reverse = "";
        for(int i=n.length()-1;i>=0;i--){
            reverse = reverse + n.charAt(i);
        }
        System.out.print("The Revwer String Is : "+reverse);
        sc.close();
    }
}
