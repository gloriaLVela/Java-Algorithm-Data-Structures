import java.util.HashSet;
import java.util.Set;

public class Solution202 {
    /**
     * Write an algorithm to determine if a number is "happy".
     * <p>
     * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
     */
    public static boolean isHappy(int n) {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(n))
        {
            int value = 0;
            while (n > 0)
            {
                value += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = value;
        }

        return n == 1;
    }

    public static void main(String[] args) {
//        System.out.println("isHappy(19) = " + isHappy(19));
//        System.out.println("isHappy(0) = " + isHappy(0));
//        System.out.println("isHappy(100) = " + isHappy(100));
        System.out.println("isHappy(4) = " + isHappy(4));
    }
}
