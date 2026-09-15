import java.util.*;
public class replace_Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.nextLine();
        String p ="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == 'e'){
                p = p+'i';
            }
            else{
                p = p+n.charAt(i);
            }
        }
        System.out.println("The String Is : "+p);
        sc.close();
    }
}
