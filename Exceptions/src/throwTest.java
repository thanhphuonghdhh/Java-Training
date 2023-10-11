public class throwTest {
    static void check(int age) {
        try {
            if (age < 18) throw new RuntimeException("No");
            else System.out.println("Ok");
        }
        catch (RuntimeException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        check(17);
        System.out.println("End");
    }
}
