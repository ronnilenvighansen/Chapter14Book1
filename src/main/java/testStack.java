/**
 * Created by Ronni on 06-10-2016.
 */
public class testStack
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();
        stack.push(12);
        stack.push(27);
        stack.push(15);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }
}
