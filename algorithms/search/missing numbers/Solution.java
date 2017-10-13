import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) A.add(scan.nextInt());
        int m = scan.nextInt();
        Set<Integer> missingNumbers = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            int no = scan.nextInt();
            if (!A.contains(no))
                missingNumbers.add(no);
            else
                A.remove(Integer.valueOf(no));
        }
        for (Integer missingNumber : missingNumbers)
            System.out.print(missingNumber + " ");
    }
}