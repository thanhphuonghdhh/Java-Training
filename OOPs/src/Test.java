class Test implements Cloneable{
    static int i;
    int j;

    static {

        System.out.println("static block called ");
    }

    public Test(int j) {
        this.j=j;
    }
    @Override
    protected Test clone() throws CloneNotSupportedException {
        return (Test) super.clone();
    }
}

class Main {
    public static void main(String args[]) throws CloneNotSupportedException {
        Test test = new Test(2);
        Test test1 = test.clone();
        System.out.println(test1.j);
    }
}