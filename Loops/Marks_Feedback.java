import java.util.*;
public class Marks_Feedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Choice : ");
        int ch = sc.nextInt();
        switch (ch) {
            case 0:
                break;
            case 1:{
                System.out.print("Enter How Much Marks you want Enter :");
                int a = sc.nextInt();
                for(int i=0;i<a;i++){
                    System.out.print("Enter Marks : ");
                    int marks = sc.nextInt();
                    if(marks >=90 && marks<=100){
                        System.out.println("Excellent");
                    }
                    else if(marks>=60 && marks<=89){
                        System.out.println("Good");
                    }
                    else{
                        System.out.println("Marks Not Matter");
                    }
                }
            }
                break;
            default:
                System.out.print("Invalid Choice");
                break;
        }
        sc.close();
    }
}
