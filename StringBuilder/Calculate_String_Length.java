import java.util.*;
public class Calculate_String_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Array : ");
        int size = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[size];
        int length = 0;
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter String : ");
            arr[i] = sc.next();
            StringBuilder sb = new StringBuilder(arr[i]);
            length = length +sb.length();
        }
        System.out.print("Length Is : "+length);
        sc.close();
    }
}
