public class thisTest {
    static int a=1;
    void call() {
        this.a=100;
        System.out.println(a);
    }

    void m(thisTest obj) {
        System.out.println(obj.a=100);
        System.out.println("invoke");
    }

    void p(){
        m(this);
        System.out.println("call p");
    }
    public static void main(String[] args) {
        new thisTest().p();


    }
}
