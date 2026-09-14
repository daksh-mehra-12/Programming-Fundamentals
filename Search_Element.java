import java.util.*;
public class Search_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows : ");
        int r = sc.nextInt();
        System.out.print("Enter Columns : ");
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter Number : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Number You Want : ");
        int s = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j] == s){
                    System.out.print("Element Found At Index : "+i +" "+ j);
                }
            }
        }
        sc.close();
    }
}