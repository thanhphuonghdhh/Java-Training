import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class MyUtils {
    public static <T> int count(List<T> collection,  T itemToCount) {
        int count = 0;
        for (int i = 0; i <collection.size(); i++){
            if (collection.get(i).equals(itemToCount))
                count++;
        }
        return count;
    }
}
class MyUtilsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        System.out.println(MyUtils.count(list,1)); // 2
    }
}