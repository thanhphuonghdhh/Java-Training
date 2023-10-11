public class Parent {
    public void display() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child");
    }

}

class Test1 {
    public static void main(String[] args) {
        Parent child = new Parent();//upcasting
        child.display();
    }
}
