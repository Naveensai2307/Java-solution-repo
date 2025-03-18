import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        double C = (5.0/9.0) * (F - 32.0);
        System.out.printf("%.1f\n", C);
    }
}
