import java.util.ArrayList;
import java.util.Stack;

public class stackIterator extends Iterator{
    private stack ds;

    public stackIterator (stack ds) {
        this.ds = ds;
    }

    @Override
    public void deleteLastEle() {
        ds.getContainer().pop();
    }

    @Override
    public void print() {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0 ; ds.getContainer().size()>0; i++){
            temp.add(ds.getContainer().peek());
            ds.getContainer().pop();
        }
        for(int i=temp.size()-1 ; i>=0; i--){
            System.out.print(temp.get(i) + " ");
            ds.getContainer().push(temp.get(i));
        }
        System.out.println();
    }
}