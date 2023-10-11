public class GCTest {
    public static void main(String[] args) {
        // nulling the reference
        GarbageCollectionTest g = new GarbageCollectionTest("G");
        g = null;

        // assign a reference to another
        GarbageCollectionTest g1 = new GarbageCollectionTest("A");
        GarbageCollectionTest g2 = new GarbageCollectionTest("B");
        g1 = g2;

        // anonymous an object
        new GarbageCollectionTest("C");

        System.gc();
    }
}
