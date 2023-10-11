import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Vector;

public interface GenericInterfaceTest<T> {
    void display(T obj);
}

class Test1<T,S> implements GenericInterfaceTest<T> {

    private S a;

    public Test1(S a) {
        this.a=a;
    }
    @Override
    public void display(T obj) {
        System.out.println(obj);
    }

    public void setA(S a) {
        this.a = a;
    }

    public S getA() {
        return a;
    }
}

class Example {
    public static void main(String[] args) {
        String a = "abc";
        Test1<String,String> test1 = new Test1("cde");
        test1.display(a);
        System.out.println(test1.getA());

        Vector<String> vector = new Vector<>();
        AbstractList<String> abstractList = new ArrayList<>();
    }
}

