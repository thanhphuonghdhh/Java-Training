public class tryCatchTest {
    public static void main(String[] args) {
        //when part of block have an exception and the whole block have another exception, we can use nested try block
        try {
            try {
                //Block of codes to be tested for errors
                int o = 0;
                int res = 10 / 0;
                System.out.println(res);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            System.out.println("Continue");
            int[] a = new int[5];
            System.out.println(a[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            //Block of code to handle errors
            System.out.println(e);
        }
    }
}
