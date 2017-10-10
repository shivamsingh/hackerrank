import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for (int x_i = 0; x_i < n; x_i++) {
            x[x_i] = in.nextInt();
        }

        Arrays.sort(x);
        int transmittersUsed = 0;
        for (int i = 0; i < n; i++) {
            i = lastHouseWithinRange(x, i, k);
            i = lastHouseWithinRange(x, i, k);
            transmittersUsed++;
        }
        System.out.print(transmittersUsed);
    }

    static int lastHouseWithinRange(int[] x, int startHouse, int transmitterRange) {
        int lastHouse = startHouse;
        while (lastHouse < x.length - 1 && x[lastHouse + 1] - x[startHouse] <= transmitterRange) lastHouse++;
        return lastHouse;
    }
}
