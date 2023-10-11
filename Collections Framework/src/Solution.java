import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        LinkedList<Integer> a = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i<=n; i++) {
            a.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        for (int i=1; i<=m; i++) {
            String s = scanner.next();

            if (s.equals("Insert")) {
                int a1 = scanner.nextInt();
                int a2 = scanner.nextInt();
                a.add(a1,a2);
            }
            if (s.equals("Delete")) {
                int a1 = scanner.nextInt();
                a.remove(a1);
            }
        }
        for (int i:a) {
            System.out.print(i+" ");
        }

    }
}