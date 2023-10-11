import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        System.out.println(vector.indexOf("b"));

        for (int i=0;i< vector.size();i++) {
            System.out.println(vector.get(i));
        }
    }
}
