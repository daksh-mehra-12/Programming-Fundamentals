import java.util.*;
public class Creat_Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String n = sc.nextLine();
        String Username = "";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i) == '@'){
                break;
            }
            else{
                Username = Username+n.charAt(i);
            }
        }
        System.out.println("Username Is : "+Username);
        sc.close();
    }
}
