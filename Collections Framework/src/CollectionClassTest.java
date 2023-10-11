import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Main Class
// SortingCollectionExample
class Test {

    // Main driver method
    public static void main(String[] args)
    {
        // Creating a list
        // Declaring object of string type
        List<String> items = new ArrayList<>();


        items.add("Shoes");
        items.add("Toys");


        Collections.addAll(items, "Fruits", "Bat", "Mouse");


        Collections.sort(items);

        // Printing the elements
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

        System.out.println();

        // Sorting according to reverse ordering
        Collections.sort(items, Collections.reverseOrder());

        // Printing the reverse order
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }
    }
}