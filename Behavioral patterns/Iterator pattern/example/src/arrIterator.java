import java.util.ArrayList;

public class arrIterator extends Iterator{
    private arr ds;

    public arrIterator(arr ds) {
        this.ds = ds;
    }

    @Override
    public void deleteLastEle() {
        ds.getContainer().remove(ds.getContainer().size()-1);
    }

    @Override
    public void print() {
        for(int i=0 ; i<ds.getContainer().size(); i++){
            System.out.print(ds.getContainer().get(i) + " ");
        }
        System.out.println();
    }
}
