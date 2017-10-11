import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int[] c = new int[n];
            for (int j = 0; j < n; j++)
                c[j] = scan.nextInt();

            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                int cost = c[j];
                int otherCost = m - c[j];
                if (map.containsKey(otherCost))
                    System.out.println(map.get(otherCost) + " " + (j + 1));
                map.putIfAbsent(cost, j + 1);
            }
        }
    }
}