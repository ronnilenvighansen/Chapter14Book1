/**
 * Created by Ronni on 19-10-2016.
 */
public class MyStackIteratorTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(27);
        stack.push(15);
        StackRepository stackRepository = new StackRepository(stack);
        Iterator iter = stackRepository.getIterator();

        while(iter.hasNext())
        {
            System.out.println("Stack content : " + iter.next());
        }
    }
}