import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s2;

        String s4 = new String("Hello");
        String s5 = s4.intern();
        String s6 = "abc";
        System.out.println(s1==s5);
        System.out.println(s1.equals(s4));
        System.out.println(s1.split("e"));
        System.out.println(s6.hashCode());
    }
}
