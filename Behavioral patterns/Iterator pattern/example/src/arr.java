import java.util.ArrayList;

public class arr extends Collection{
    private ArrayList<Integer> container;

    public arr(ArrayList<Integer> container) {
        this.container = container;
    }

    public ArrayList<Integer> getContainer() {
        return container;
    }

    @Override
    public Iterator createIterator() {
        return new arrIterator(this);
    }
}
