public class StringBufferTest {
    public static void main(String[] args) {
        //String time
        long start = System.nanoTime();

        String s = "";
        for (int i = 1; i<=1000;i++) {
            s+="hello";
        }

        long end =System.nanoTime();
        System.out.println(end-start);

        //StringBuffer time
        long start1 = System.nanoTime();

        StringBuffer s1 = new StringBuffer();
        for (int i = 1; i<=1000;i++) {
            s1.append("hello");
        }

        long end1 =System.nanoTime();
        System.out.println(end1-start1);

        //StringBuilder time
        long start2 = System.nanoTime();

        StringBuilder s2 = new StringBuilder();
        for (int i = 1; i<=1000;i++) {
            s2.append("hello");
        }

        long end2 =System.nanoTime();
        System.out.println(end2-start2);

        StringBuffer ss = new StringBuffer(10);
        ss.append("Hello...!");
        System.out.println(ss);
        ss.insert(8," Java");
        System.out.println(ss);
        ss.delete(5,8);
        System.out.println(ss);
    }
}
