import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double a = (x2 - x1) * (x2 - x1);
        double b = (y2 - y1) * (y2 - y1);
        double Distance = Math.sqrt(a + b);
        System.err.printf("%.1f\n", Distance);
        sc.close();
    }
}