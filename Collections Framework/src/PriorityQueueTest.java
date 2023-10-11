import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<String> a = new PriorityQueue<>();

        //add element at the tail
        a.offer("E");// not throw exception, return false
        a.offer("A");
        a.offer("H");
        a.add("G");//throw exception
        a.add("B");

        //remove and return element at the head of the queue
        System.out.println(a.remove());//throw exception when queue is null
        System.out.println(a.poll());// not throw exception, return null

        //only return element at the head of the queue
        System.out.println(a.element());//throw exception when queue is null
        System.out.println(a.peek());// not throw exception, return null
    }
}
