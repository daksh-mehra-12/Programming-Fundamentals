import java.util.*;
public class Inverted_left_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Last Rows : ");
        int r = sc.nextInt();
        for(int i=r;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
