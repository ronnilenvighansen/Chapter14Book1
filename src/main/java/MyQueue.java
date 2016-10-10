//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ronni on 10-10-2016.
 */
public class MyQueue <T>
{
    private List<T> myData = new ArrayList<T>();

    public void add(T value)
    {
        myData.add(value);
    }

    public T remove()
    {
        T temp = myData.remove(0);
        return temp;
    }

    public T get(int index)
    {
        return myData.get(index);
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public T peek()
    {
        return myData.get(0);
    }

    public int size()
    {
        return myData.size();
    }

    public String toString()
    {
        return myData.toString();
    }
}
