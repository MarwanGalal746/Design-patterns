import java.util.ArrayList;
import java.util.Stack;

public class Client {

    public static void main(String[] args) {
        Stack<Integer>s = new Stack<Integer>();
        s.push(1); s.push(2); s.push(3);
        stack St = new stack(s);
        Iterator stIterator = new stackIterator(St);
        ArrayList<Integer>a = new ArrayList<>();
        a.add(4); a.add(5); a.add(6);
        arr Ar = new arr(a);
        Iterator arIterator = new arrIterator(Ar);
        System.out.println("Before deleting last element in both:");
        stIterator.print(); arIterator.print();
        stIterator.deleteLastEle(); arIterator.deleteLastEle();
        System.out.println("After deleting last element in both:");
        stIterator.print(); arIterator.print();

    }
}
