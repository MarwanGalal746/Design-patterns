import java.util.Stack;

public class stack extends Collection{
    private Stack<Integer> container;

    public stack(Stack<Integer> container) {
        this.container = container;
    }

    public Stack<Integer> getContainer() {
        return container;
    }

    @Override
    public Iterator createIterator() {
        return new stackIterator(this);
    }
}
