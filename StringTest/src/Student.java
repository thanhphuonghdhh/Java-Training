import java.time.LocalDate;

public class Student {
    LocalDate day;
    String name;

    public Student(LocalDate day, String name) {
        this.day = day;
        this.name = name;
    }

    public static void main(String[] args) {

        String name = "ABcs1";
        for (int i=0;i<name.length();i++) {
            if (!((name.charAt(i) - 'A' >= 0 && name.charAt(i)-'A'<= 25) ||
                    (name.charAt(i) - 'a' >=0 && name.charAt(i)-'a' <=25))) {


                System.out.println(name.charAt(i));

            }

        }
    }
}
