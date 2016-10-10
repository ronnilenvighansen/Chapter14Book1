import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ronni on 10-10-2016.
 */
public class MyStackTest {
    MyStack stack = new MyStack();
    @Before
    public void setUp() throws Exception
    {
        stack.push(1);
    }

    @Test
    public void push() throws Exception
    {
        assertEquals(1, stack.get(0));
    }

    @Test
    public void pop() throws Exception
    {
        assertEquals(1, stack.pop());
    }

    @Test
    public void isEmpty() throws Exception
    {
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void peek() throws Exception
    {
        assertEquals(1, stack.peek());
    }

    @Test
    public void size() throws Exception
    {
        assertEquals(1, stack.size());
    }
}