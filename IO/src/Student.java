import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Student implements Serializable {
    private int id;
    private String name;

    private static final long serialVersionUID = 12L; //???

    public Student(int id, String name) {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("src1/c.txt"));
        Student a = new Student(1,"A");
        o.writeObject(a);
        o.close();

        ObjectInputStream o1 = new ObjectInputStream(new FileInputStream("src1/c.txt"));
        Student b = (Student) o1.readObject();
        System.out.println(b.toString());





    }
}
