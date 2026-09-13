import java.util.*;
public class Creating_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("----------Enter Valus-------");
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("--------Output Values--------");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}