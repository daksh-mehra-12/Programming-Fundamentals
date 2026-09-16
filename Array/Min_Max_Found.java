import java.util.Scanner;
public class Min_Max_Found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Value : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Min : "+min);
        System.out.println("Max : "+max);
        sc.close();
    }
}
