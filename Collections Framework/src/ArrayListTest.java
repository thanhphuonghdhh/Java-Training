import java.util.*;

class Student implements Comparable<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) ;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getId() - o.getId();
    }
}
public class ArrayListTest {

    String a,b,c;

    public ArrayListTest(String a, String b, String c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListTest that = (ArrayListTest) o;
        return Objects.equals(a, that.a) && Objects.equals(b, that.b) && Objects.equals(c, that.c);
    }

    @Override
    public int hashCode() {

        return Objects.hash(a, b, c);
    }

    public int hash1() {
        int result = 17;
        result = 31 * result + Objects.hashCode(a);
        result = 31 * result + Objects.hashCode(b);
        result = 31 * result + Objects.hashCode(c);
        return result;
    }
    public static void main(String[] args) {
        TreeMap<String, Integer> a = new TreeMap<>();
        a.put("A",1);
        a.put("B",2);
        a.put("C",3);
        a.put("F",4);
        a.put("Q",5);
        a.forEach((s1,s2) -> {
            System.out.println(s1+" "+ s2);
        });

        Student s1 = new Student(10,"Pham Van A");
        Student s2 = new Student(7,"Nguyen Van Binh");
        Student s3 = new Student(9,"Dang Van C");
        Student s4 = new Student(19,"Dang Van V");
        Student s5 = new Student(10,"Pham Van A");

        TreeMap<Student,Integer> hashMap = new TreeMap<>();
        hashMap.put(s1,1);
        hashMap.put(s2,2);
        hashMap.put(s3,3);
        hashMap.put(s4,4);
        hashMap.put(s5,5);

        hashMap.forEach((ss1,ss2) -> {
            System.out.println(ss1.toString()+" "+ss2);
        });

    }
}
