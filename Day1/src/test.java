import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        int a = 1;
        Integer a1 = Integer.valueOf(a);
        int b = a1.intValue();

        Double d = Double.valueOf(2.5);
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(Integer.valueOf(100));
        System.out.println(list.get(0) + " " + list.get(1));
        System.out.println(a1+" "+b);
        System.out.println(a1 instanceof Integer);
        System.out.println(d instanceof Double);
    }
}
