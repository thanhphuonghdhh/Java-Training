import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface Parent{
    //only one abstract method
    void say();

    //default method: default implementation of method, class do not have to implement again (can be overridden)
    default void print() {
        System.out.println("Hello");
    }

    //static method (
    static void display() {
        System.out.println("OK");
    }

    //FunctionalInterface can have method of Object class
    String toString();
    int hashCode();
}

interface Parent2{
    void say();
    default void print() {
        System.out.println("Hello2");
    }
}
class Child1 implements Parent {
    private int id;
    public Child1(int id) {
        this.id=id;
    }
    @Override
    public void say() {
        System.out.println("Hi1");
        Parent.display();
    }

    @Override
    public void print() {
        Parent.super.print();
    }

    @Override
    public String toString() {
        return "Child1{" +
                "id=" + id +
                '}';
    }
}

class Child2 implements Parent,Parent2 {

    @Override
    public void say() {
        System.out.println("Hi2");
    }

    @Override
    public void print() {
        Parent2.super.print();//use super to decide which interface to implement
        //System.out.println("Hello there");
    }
}

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        Child1 child1 = new Child1(1);
        child1.say();
        child1.print();
        Parent.display();
        System.out.println(child1.toString());
        Child2 a = new Child2();
        a.print();


    }
}
