/**
 * Created by Ronni on 19-10-2016.
 */
public class StackRepository<T> implements Container {
    MyStack stack;

    public StackRepository(MyStack stack)
    {
        this.stack = stack;
    }
    public Iterator getIterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {

        int index = stack.size() - 1;

        public boolean hasNext() {

            if(index >= 0){
                return true;
            }
            return false;
        }

        public Object next() {

            if(this.hasNext()){
                return stack.get(index--);
            }
            return null;
        }
    }
}