import java.util.*;


interface Sayable {
    String Say();
}


public class LambdaTest {

    static String display() {
        return "display LambdaTest";
    }
    String invalid() {
        return "invalid LambdaTest";
    }
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(10);
        s.add(5);
        s.add(108);
        s.add(20);
        s.add(101);
        s.add(28);
        //use lambda
        Collections.sort(s,(s1,s2) -> {
            return s1-s2;
        });

        //not use lambda
        Collections.sort(s, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        s.forEach(s1 -> System.out.println(s1));
        s.forEach(System.out::println);
        Sayable s1 = () -> {
            return "Hello";
        };
        System.out.println(s1.Say());

        //method reference
        Sayable s2 = LambdaTest::display;// Class::staticMethod
        System.out.println(s2.Say());

        LambdaTest lambdaTest = new LambdaTest();//object::instanceMethod
        Sayable s3=lambdaTest::invalid;
        System.out.println(s3.Say());

        List<Integer> list = Arrays.asList(1,2,10,123,98,12);
        list.sort(Integer::compareTo);//Class::instanceMethod
        list.forEach(ss -> System.out.print(ss+" "));

        HashMap<String,Integer> a = new HashMap<>();
        a.put("A",1);
        a.forEach((k,v) -> System.out.println(k+" "+v));
    }
}
