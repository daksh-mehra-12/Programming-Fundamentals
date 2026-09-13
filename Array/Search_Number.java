import java.util.*;
public class Search_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter Value : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Value You Want To Search : ");
        int s = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == s){
                System.out.print("Elemext found At Index : "+i);
            }
        }
        sc.close();
    }
}
