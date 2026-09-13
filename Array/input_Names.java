import java.util.*;
public class input_Names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        String arr[] = new String[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Value : ");
            arr[i] = sc.next();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
