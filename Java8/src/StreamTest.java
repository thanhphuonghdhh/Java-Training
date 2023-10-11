import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {
    private static long counter;

    private static void wasCalled() {
        counter++;
    }
    public static void main(String[] args) {

        //empty Stream
        Stream<String> empty = Stream.empty();

        //collection Stream
        ArrayList<String> a = new ArrayList<>();
        a.add("An");
        a.add("Binh");
        a.add("Bac");
        a.add("Can");
        a.add("Canh");
        a.add("Dong");
        Stream<String> s = a.stream();

        //array Stream
        Stream<String> arrStream = Stream.of("A","B","C");

        String[] arr = new String[]{"a","b","c"};
        Stream<String> arrStream2 = Arrays.stream(arr);

        Stream.iterate(9, count -> count+1) //generate Stream from 9
                //intermediate operation
                .filter(no -> no%3 ==1)//remove element based on criteria
                .skip(2)//remove first n element, if stream contain less than n element then empty stream will be return
                .limit(6)//limit size of stream
                .map(no -> no*2)// map element to corresponding result
                .sorted((s1,s2) -> s2-s1)//sort element
                //terminal operation: get result from defined intermediate operation
                // (only one per stream), only return void or non-stream object
                . forEach(item -> System.out.println(item));

        List<Integer> collectStream = Stream.iterate(9, count -> count+1)
                .filter(no -> no%3 ==1)
                .limit(5)
                . collect(Collectors.toList());
        //collectStream.forEach(System.out::print);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        counter = 0;
        Stream<String> stream = list.stream().filter(element -> {
            wasCalled();
            System.out.println(element);
            return element.contains("2");
        });
        //stream.forEach(System.out::println);
        System.out.println(counter);
    }
}
