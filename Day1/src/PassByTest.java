public class PassByTest {

    public static void change(Integer a) {
        a = a + 10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Integer a = Integer.valueOf(10);
        System.out.println(a);
        change(a);
        System.out.println(a);
    }
}
