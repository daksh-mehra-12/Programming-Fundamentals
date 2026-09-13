import java.util.*;
public class Check_Sort_OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Value : ");
            arr[i] = sc.nextInt();
        }
        boolean check = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] >arr[i+1]){
                check = false;
            }
        }
        if(check){
            System.out.println("Assending");
        }
        else{
            System.out.println("Not Assending");
        }
        sc.close();
    }
}
