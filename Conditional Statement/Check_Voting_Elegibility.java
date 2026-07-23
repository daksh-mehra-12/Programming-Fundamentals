import java.util.*;
public class Check_Voting_Elegibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int a = sc.nextInt();
        if(a>=18){
            System.out.print("Elegible For Voting");
        }
        else{
            System.out.print("Not Elegible");
        }
        sc.close();
    }
}

