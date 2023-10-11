public class Example4 {
    private int a=10;

    public Example4() {
        System.out.println("call empty constructor");
    }

    public Example4(int a) {
        this();//Invoke constructor of current class
        this.a=a;//Refer to instance variables of current class
    }


    void m(Example4 obj) {
        System.out.println("Hello Java");
    }

    void p() {
        System.out.println("call p");
        m(this);//Pass as an argument in the method
    }

    void n() {
        this.p();//Invoke method of current class
    }

    Example4 getExample() {
        return this;//return the current class instance
    }
    public static void main(String args[]) {
        Example4 o1 = new Example4();
        o1.n();
        System.out.println(o1);
        System.out.println(o1.getExample());
    }
}