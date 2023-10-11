public class PropagateTest {
    public static void m() {
        int a = 1/0;
        //throw new IOException("No");
    }

    public static void n() {
        m();
    }

    public static void p(){
        try {
         n();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        PropagateTest a = new PropagateTest();
        a.p();
        System.out.println("end");
    }
}
