import java.util.*;
public class Count_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        String s = "";
        while(n>0){
            int d = n%2;
            s = d + s;
            n = n/2;
        }
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println("The Number Of 1 Bit Is : "+count);
        sc.close();
    }
}
