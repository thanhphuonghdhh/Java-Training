public class PassByValueTest {

    public static void change(Number a) {
        a.value = a.value + 10;
    }
    public static void main(String[] args) {
        Number a = new Number(10);
        System.out.println(a.value);
        change(a);
        System.out.println(a.value);

    }
}

class Number {
    public int value;

    public Number(int value) {
        this.value = value;
    }
}