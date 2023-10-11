public class finallyTest {
    public static void main(String[] args) {
        try {// code have exception
            int a = 25/0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            // catch the exception
            System.out.println(e);
            //System.exit(0);
        }
        finally {
            // code that is always executed
            System.out.println("Complete");
        }
        System.out.println("Out");
    }
}
