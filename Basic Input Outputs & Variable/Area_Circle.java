import java.util.*;
public class Area_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RAdius : ");
        int r = sc.nextInt();
        double area = 3.17*r*r;
        System.out.print("THe Area Is : "+area);
        sc.close();
    }
}
