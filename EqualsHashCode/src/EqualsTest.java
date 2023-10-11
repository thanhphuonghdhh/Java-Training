import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class EqualsTest {

    String a,b,c;
    public EqualsTest(String a, String b, String c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    /*
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        EqualsTest tmp = (EqualsTest) o;
        return tmp.a == this.a && tmp.b == this.b;
    }

     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest that = (EqualsTest) o;
        return a == that.a && b == that.b && c==that.c;
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }


    public int hash() {
        int result = 17,r1=17;
        result = 31 * result + Objects.hashCode(a);
        result = 31 * result + Objects.hashCode(b);
        result = 31 * result + Objects.hashCode(c);
        r1=31*(31*(31*17+Objects.hashCode(a))+Objects.hashCode(b))+Objects.hashCode(c);
        System.out.println(r1==result);
        return result;
    }

    public static void main(String[] args) {
        EqualsTest a1 = new EqualsTest("Eduardo", "Rodriguez", "Pitcher");
        EqualsTest a2 = new EqualsTest("Eduardo", "Rodriguez", "Pitcher");
        System.out.println(a1.hashCode());
        System.out.println(a1.equals(a2));
        String a="pollinating sandboxes";
        String b="amusement & hemophilias";
        String c = "KING";
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

    }
}
