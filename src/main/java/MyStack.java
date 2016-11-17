import java.util.*;

public class MyStack<T>
{
    private final int DEFAULT_CAPACITY = 2;
    private final double LOAD_FACTOR = 0.75;
    private int capacity;
    private T[] myData;
    private int top = -1;

    public MyStack()
    {
        this.capacity = DEFAULT_CAPACITY;
        this.myData = (T[]) new Object[capacity];
    }

    public MyStack(int capacity)
    {
        this.capacity = capacity;
        this.myData = (T[]) new Object[this.capacity];
    }

    public T get(int index)
    {
        return myData[index];
    }

    public void push(T value)
    {
        top++;
        if(size() / capacity > LOAD_FACTOR)
        {
            resize(myData);
        }
        myData[top] = value;
    }

    public T pop()
    {
        return myData[top--];
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public T peek()
    {
        return myData[top];
    }

    public int size()
    {
        int size = 0;
        for(int i = 0; i <= top; i++)
        {
            size++;
        }
        return size;
    }

    public void resize(Object o)
    {
        this.capacity *= 2;
        this.myData = Arrays.copyOf((T[]) o, capacity);
    }

    public String toString()
    {
        String result = "[";
        result += myData[0];
        for(int i = 1; i <= top; i++)
        {
            result += ", " + myData[i];
        }
        result += "]";
        return result;
    }
}