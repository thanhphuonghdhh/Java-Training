import java.io.IOException;

public class InheritanceException {
    public void m() {
        System.out.println("hello");
    }
    public void n() {

    }

    public void p() throws IOException {
        throw new IOException("a");
    }

    public void p1() throws Exception {
        throw new Exception("a");
    }

    public void p2() throws IOException {

    }
}

class child extends InheritanceException {
    //can only throw unchecked exception
    @Override
    public void m() throws ArithmeticException {
        super.m();
    }
    //cannot throw checked exception
    /*
    public void n() throws IOException {

    }

     */
    //throw same exception
    @Override
    public void p() throws IOException {
        super.p();
    }
    //throw child exception
    @Override
    public void p1() throws IOException {
        System.out.println("p1");
    }
    //cannot throws parent exception
    /*
    @Override
    public void p2() throws Exception {
        super.p2();
    }

     */
}