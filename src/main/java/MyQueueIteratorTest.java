/**
 * Created by Ronni on 19-10-2016.
 */
public class MyQueueIteratorTest
{
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(12);
        queue.add(27);
        queue.add(15);
        QueueRepository queueRepository = new QueueRepository(queue);

        for(Iterator iter = queueRepository.getIterator(); iter.hasNext();){
            System.out.println("Queue content : " + iter.next());
        }
    }
}
