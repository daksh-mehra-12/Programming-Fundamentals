import java.util.Scanner;
public class Transpose {
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
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}
