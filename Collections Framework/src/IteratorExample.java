import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Create list with no parameter
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            // Add element to list
            list.add("0" + i);
        }

        // for loop
        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        //for-each loop
        for (String i:list) {
            System.out.println(i);
        }

        //while loop
        int i = 0;
        while (i< list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        //iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //ListIterator
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            listIterator.set("0"+listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
            System.out.println(listIterator.nextIndex());
        }

        //Stream
        list.stream().forEach(i1 -> System.out.println(i1));
    }
}