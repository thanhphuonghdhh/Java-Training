import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[5];
            a[4]=1;
            int c = x/y;
            System.out.print(c);
        }
        catch (ArithmeticException e) {
            System.out.print(e);
        }
        catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}