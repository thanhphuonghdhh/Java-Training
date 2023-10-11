import java.io.IOException;

public class throwsTest {
    public void call() throws IOException {
        System.out.println("Ok");
    }

    public void call1() throws IOException {
        throw new IOException("Np");
    }
    public static void main(String[] args) throws IOException,RuntimeException{
        throwsTest a = new throwsTest();
        a.call();//execute OK
        try {
            a.call1();//exception is thrown at runtime because throw don't handle the exception
        }
        catch (RuntimeException e) {
            System.out.println(e);
        }
        try{
            a.call1();
        }
        catch (IOException e){
            System.out.println(e);
        }

        System.out.println("End");
    }
}
