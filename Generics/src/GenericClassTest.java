public class GenericClassTest<K,V> {
    private K a;
    private V b;
    public GenericClassTest(K a,V b){
        this.a=a;
        this.b=b;
    }

    public void setA(K a) {
        this.a = a;
    }

    public K getA() {
        return a;
    }

    public V getB() {
        return b;
    }

    public void setB(V b) {
        this.b = b;
    }

}


class GenInherit1<K> extends GenericClassTest<K, String> {
    public GenInherit1(K a, String b) {
        super(a,b);
    }
}

class GenInherit2 extends GenericClassTest<Integer,String> {
    public GenInherit2(Integer a,String b){
        super(a,b);
    }
}

class GenInherit3<K,V> extends GenericClassTest<K,V> {
    public GenInherit3(K a, V b){
        super(a,b);
    }
}

class GenInherit4<K,V,T> extends GenericClassTest<K,V> {
    private T c;
    public GenInherit4(K a,V b, T c){
        super(a,b);
        this.c=c;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }


}
class GenericClass{
    public static void main(String[] args) {
        GenericClassTest<Integer,String> g = new GenericClassTest<Integer, String>(1,"a");
        GenInherit4<Integer, Integer,String> g1 = new GenInherit4<>(1,2,"aa");
        System.out.println(g.getA()+g.getB());
        System.out.println(g1.getA()+g1.getB()+g1.getC());
    }
}
