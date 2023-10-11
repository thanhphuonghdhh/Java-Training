import java.util.Optional;

public class OptionalTest {

    public static String defaultValue() {
        return "default";
    }
    public static void main(String[] args) {

        Optional<String> e = Optional.empty();
        Optional<String> e1 = Optional.ofNullable(null);
        Optional<String> e2 = Optional.of("A");
        System.out.println(e.isPresent());//check if wrapped object not null

        e2.ifPresent(s -> System.out.println(s));//check not null

        //return optional object if not null, else return default value
        String s = e2.orElseGet(OptionalTest::defaultValue);//optimize memory, only executed when necessary
        String s1 = e1.orElse(defaultValue());//always executed
        System.out.println(s1);

        //throw exception instead of default value
        try {
            String s3 = e.orElseThrow(IllegalArgumentException::new);
            System.out.println(s3);
        }
        catch (IllegalArgumentException exception){
            System.out.println(exception);
        }

        //if the wrapped object pass then return that else return empty optional
        System.out.println(e2.filter(c -> c.equals("B")).isPresent());
    }
}
