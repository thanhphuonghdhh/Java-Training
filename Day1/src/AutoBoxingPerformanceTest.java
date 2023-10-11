import java.util.ArrayList;
import java.util.List;

public class AutoBoxingPerformanceTest {
    public static void main(String[] args) {
        long t1 = 0;
        long t2 = 0;
        List<Integer> listValues = new ArrayList<>();
        int arrValues[] = new int[100000000];
        for (int i = 0; i< 1000000; i++) {
            listValues.add(i);
            arrValues[i] = i;
        }

        t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            listValues.set(i, listValues.get(i) * 10);
        }

        t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);

        t1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrValues[i] = arrValues[i] * 10;
        }

        t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
