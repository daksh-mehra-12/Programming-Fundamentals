import java.util.*;
public class Calculate_String_Length{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length Of Array : ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter Name : ");
            arr[i] = sc.nextLine();
        }

        int length = 0;
        for(int i=0;i<arr.length;i++){
            length = length+arr[i].length();
        }
        System.out.println("The Length Is : "+length);
        sc.close();
    }
}