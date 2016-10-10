import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ronni on 10-10-2016.
 */
public class MyQueueTest {
    MyQueue queue = new MyQueue();

    @Before
    public void setUp() throws Exception
    {
        queue.add(1);
    }

    @Test
    public void add() throws Exception
    {
        assertEquals(1, queue.get(0));
    }

    @Test
    public void remove() throws Exception
    {
        assertEquals(1, queue.remove());
    }

    @Test
    public void isEmpty() throws Exception
    {
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void peek() throws Exception
    {
        assertEquals(1, queue.peek());
    }

    @Test
    public void size() throws Exception
    {
        assertEquals(1, queue.size());
    }

}