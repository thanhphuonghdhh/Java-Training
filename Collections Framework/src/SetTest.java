import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("KING");
        s.add("BLAKE");
        s.add("JONES");
        s.add("WARD");
        s.add("SMITH");
        s.add("FORD");

        s.add("CLARK");
        System.out.println(s.contains("b"));
        for (String i:s
             ) {
            System.out.println(i);
        }
    }
}
