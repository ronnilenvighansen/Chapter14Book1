/**
 * Created by Ronni on 19-10-2016.
 */
public class QueueRepository<T> implements Container {
    MyQueue queue;

    public QueueRepository(MyQueue queue)
    {
        this.queue = queue;
    }
    public Iterator getIterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator {

        int index;

        public boolean hasNext() {

            if(index < queue.size()){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return queue.get(index++);
            }
            return null;
        }
    }
}