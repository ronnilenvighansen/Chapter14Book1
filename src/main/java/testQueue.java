/**
 * Created by Ronni on 10-10-2016.
 */
public class testQueue
{
    public static void main(String[] args)
    {
        MyQueue queue = new MyQueue();
        queue.add(12);
        queue.add(27);
        queue.add(15);
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.peek());
    }
}
