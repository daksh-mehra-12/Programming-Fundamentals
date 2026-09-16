import java.util.Scanner;

public class spiral_order_matrix {
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
        int start_row = 0;
        int start_col = 0;
        int end_row = r-1;
        int end_col = c-1;
        while(start_row<=end_row && start_col<=end_col){
            for(int i=start_col;i<=end_col;i++){
                System.out.print(arr[start_row][i]);
            }
            start_row++;
            for(int i=start_row;i<=end_row;i++){
                System.out.print(arr[i][end_col]);
            }
            end_col--;
            if(start_row<=end_row){
                for(int i=end_col;i>=start_col;i--){
                    System.out.print(arr[end_row][i]);
                }
                end_row--;
            }
            if(start_col<=end_col){
                for(int i=end_row;i>=start_row;i--){
                    System.out.print(arr[i][start_col]);
                }
                start_col++;
            }
        }
        sc.close();
    }
}
