public class GarbageCollectionTest {

    public String name;
    public GarbageCollectionTest(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        // nulling the reference
        GarbageCollectionTest g = new GarbageCollectionTest("g");
        g = null;

        // assign a reference to another
        GarbageCollectionTest g1 = new GarbageCollectionTest("g1");
        GarbageCollectionTest g2 = new GarbageCollectionTest("g2");
        g1 = g2;

        // anonymous an object
        new GarbageCollectionTest("anonymous");

        System.gc();
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected" + " " + this.name);

    }
}
