import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapTest {
    public static void main(String args[]) {
        // init map
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Basic java");
        map.put(2, "OOP");
        map.put(6, "Multi-Thread");
        map.put(3, "Collection");
        map.put(1,"B");
        map.put(5,"An");
        System.out.println(map.get(1));
        // show map using method keySet()
        for (Integer key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("---");

        // show map using method keySet()
        for (Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
    }
}