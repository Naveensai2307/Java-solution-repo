import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 2 * (a * a);
        int y = 2 * (b * b);
        int Area = x + y;
        System.out.println(Area);
    }
}