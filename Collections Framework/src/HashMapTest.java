import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    public static void main(String[] args) {
        HashMap<String,String> a = new HashMap<>();
        a.put("Name","Phuong");
        a.put("Age","21");
        a.put("Name","An");
        Set<String> key = a.keySet();
        for (String item : key) {
            System.out.println(item+" "+a.get(item));
        }
        String aa = "CLARK";
        int h,h1;
        h = aa.hashCode();
        h1 = h >>>16;
        h = h ^ h1;
        System.out.println(h);
        System.out.println(hash(aa));



    }
}
