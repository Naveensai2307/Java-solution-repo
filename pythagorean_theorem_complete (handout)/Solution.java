import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = a * a;
        double y = b * b;
        double c = Math.sqrt(x + y);
        System.out.printf("%.1f\n", c);
        sc.close();
    }
}
