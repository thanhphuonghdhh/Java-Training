import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;

public class ComparableTest implements Comparable<ComparableTest>{
    private int id;
    private String name;

    public ComparableTest(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(ComparableTest o) {
        return - getId() + o.getId();
    }

    public static void main(String[] args) {
        TreeSet<ComparableTest> a = new TreeSet<>();
        a.add(new ComparableTest(3,"An"));
        a.add(new ComparableTest(1,"Back"));
        a.add(new ComparableTest(10,"A"));
        //Collections.sort(a);
        for (ComparableTest i:a) {
            System.out.println(i.getId()+" "+i.getName());
        }
    }
}
