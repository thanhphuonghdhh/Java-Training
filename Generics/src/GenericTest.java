import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class GenericTest {

    public static void main(String[] args) {
        List a = new LinkedList<>();
        a.add(Integer.valueOf(1));
        a.add(Integer.valueOf(2));
        a.add(Integer.valueOf(3));
        Integer i = (Integer) a.listIterator().next();



    }
}
