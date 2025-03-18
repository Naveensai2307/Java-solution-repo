import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] word = text.split(" ");
        System.out.println("Hi " + word[2] + ", " + word[1] + ", " + "and " + word[0] + ".");
    }
}
