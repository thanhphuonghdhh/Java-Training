import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    private int id;
    private String name;

    public ComparatorTest(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        List<ComparatorTest> a = new ArrayList<>();
        a.add(new ComparatorTest(10,"An"));
        a.add(new ComparatorTest(1,"Anh"));
        a.add(new ComparatorTest(108,"b"));
        a.add(new ComparatorTest(2,"Nam"));

        Collections.sort(a, new ComparatorByID());
        for (ComparatorTest i:a) {
            System.out.println(i.getId()+" "+i.getName());
        }

        Collections.sort(a, new ComparatorByName());
        for (ComparatorTest i:a) {
            System.out.println(i.getId()+" "+i.getName());
        }


    }
}
class ComparatorByID implements Comparator<ComparatorTest> {
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return o1.getId() - o2.getId();
    }
}

class ComparatorByName implements Comparator<ComparatorTest> {
    public int compare(ComparatorTest o1, ComparatorTest o2) {
        return o1.getName().compareTo(o2.getName());
    }
}