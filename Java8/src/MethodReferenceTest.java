import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface SayHello {
    void display(String say);
}

class Hello implements SayHello {
    public Hello(String say) {
        System.out.print(say);
    }

    @Override
    public void display(String say) {
        System.out.println(say);
    }
}

class Bicycle {
    String brand;
    int frameSize;
    public Bicycle(String brand) {
        this.brand = brand;
        this.frameSize = 0;
    }


}
public class MethodReferenceTest {

    public static void main(String[] args) {
        SayHello ref = Hello::new;
        ref.display("Welcome to gpcoder.com");

        List<String> bike = Arrays.asList("A","B","D","c");
        bike.stream().map(Bicycle::new).toArray(Bicycle[]::new);

    }

}