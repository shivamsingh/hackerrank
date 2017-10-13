import java.io.*;
import java.sql.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) x[i] = scan.nextInt();
        Arrays.sort(x);
        int count = 0;

        int i = 0, j = 1;
        while (j < n) {
            int diff = x[j] - x[i];
            if (diff == k) count++;
            if (diff <= k) j++;
            if (diff > k) i++;
        }
        System.out.print(count);
    }
}