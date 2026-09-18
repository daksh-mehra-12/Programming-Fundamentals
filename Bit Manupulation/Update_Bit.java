import java.util.*;
public class Update_Bit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int n = sc.nextInt();
    System.out.print("Enter Position : ");
    int p = sc.nextInt();
    System.out.print("U Want To Update In Which ??");
    int c = sc.nextInt();
    int bitmas = 1<<p;
    int not = ~bitmas;
    int new_num = 0;
    if(c==0){
        new_num = not & n;
    }
    else if(c==1){
        new_num = bitmas | n;
    }
    else{
        System.out.println("Not Applicable");
    }
    System.out.println(new_num);
    sc.close();
   } 
}
