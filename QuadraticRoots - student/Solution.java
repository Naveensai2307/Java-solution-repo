import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = sc.nextInt();
        int c = sc.nextInt();
        double x = (-b + Math.sqrt(b * b - 4 * a * c))/ (2 * a);
        System.err.println(x);
        double y = (-b - Math.sqrt(b * b - 4 * a * c))/ (2 * a);
        System.err.println(y);
        sc.close();
    }
}