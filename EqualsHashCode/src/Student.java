public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    /*
    public  boolean equals(Object o) {
        if (o == null || !(o instanceof Student)) return false;
        if (this == o) return true;
        Student s = (Student) o;
        if (this.id==s.id && this.name==s.name && this.age==s.age) {
            return true;
        }

        return false;
    }
    */
    @Override
    public String toString() {
        return id + " " + name + " " + age;
    }

    public static void main(String[] args) {
        Student student = new Student(1,"An",20);
        Student student1 = new Student(1,"An", 20);


        System.out.println(student.equals(student1));
        System.out.println(student.toString());
    }
}
