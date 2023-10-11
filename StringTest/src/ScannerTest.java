import java.util.Scanner;

public class ScannerTest {

    public void m() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        ScannerTest s = new ScannerTest();
        s.m();
    }
}
