import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        double r = sc.nextDouble();
        double Area = Math.round(pi * r * r * 100.0)/100.0;
        System.out.printf("%.2f\n",Area);
        sc.close();
    }
}