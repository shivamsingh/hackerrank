import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int[] a) {
        String result = "NO";
        int total = 0;
        for (int i = 0; i < a.length; i++)
            total += a[i];
        int leftSum = 0;
        for (int i = 0; i < a.length; i++) {
            if (leftSum == total - leftSum - a[i]) {
                result = "YES";
                break;
            }
            leftSum += a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int a0 = 0; a0 < T; a0++) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            String result = solve(a);
            System.out.println(result);
        }
    }
}
