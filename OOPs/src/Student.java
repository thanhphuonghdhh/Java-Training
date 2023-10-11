public class Student {
    private String name;
    private String address;
    private double gpa;

    public Student(String name, String address, double gpa) {
        this.name=name;
        this.address=address;
        this.gpa=gpa;
    }

    @Override
    public String toString() {
        return  "Name: " + name+
                ", address: " + address +
                ", GPA: " + gpa;
    }
}
 class Entry122 {
    public static void main(String[] args) {
        Student s = new Student("Kien", "Ha Noi", 6.6);
        Student s1 = new Student("Kien", "Ha Noi", 6.6);
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
    }
}