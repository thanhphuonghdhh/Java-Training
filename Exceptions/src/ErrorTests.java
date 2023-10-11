import java.util.HashMap;
import java.util.Scanner;

public class ErrorTests {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> h = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            h.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (h.get(s) == null) {
                System.out.println("Not found");
            }
            else {
                System.out.println(s+"="+h.get(s));
            }
        }
    }
}
