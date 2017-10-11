import javax.xml.stream.events.Characters;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        Arrays.sort(unsorted, (o1, o2) -> {
            if (o1.length() < o2.length())
                return -1;
            if (o1.length() > o2.length())
                return 1;
            return o1.compareTo(o2);
        });

        for (int i = 0; i < n; i++)
            System.out.println(unsorted[i]);
    }
}
