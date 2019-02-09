import java.util.Vector;

/**
 * @author Ikram Gabiyev
 * ************************
 * Stack Data Structure
 */

public class Stack {
    //The Vector list to store data
    private Vector<Integer> list = new Vector<Integer>();

    public void push(int a) {
        list.add(a);
    }
    public int pop() {
        return list.remove(list.size() - 1);
    }
    public int peek() {
        return list.get(list.size() - 1);
    }
    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}