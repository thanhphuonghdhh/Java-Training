public class StaticTest {
    int a;

    class A{
        public int b = 1;
        public void display() {
            System.out.println("display");
        }
    }


    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        StaticTest.A a1 = staticTest.new A();
        a1.display();
    }
}
