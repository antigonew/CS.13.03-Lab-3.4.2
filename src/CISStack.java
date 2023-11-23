import java.util.ArrayList;
import java.util.EmptyStackException;

public class CISStack {
    private ArrayList<Integer> stack;
    private int size;
    private int pointer;

    public CISStack(int capacity) {
        stack = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            stack.add(null);
        }
        size = 0;
        pointer = -1;
    }

    public void push(int data) {
        if (pointer == stack.size() - 1) {
            throw new StackOverflowError();
        }
        pointer++;
        stack.set(pointer, data);
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int data = stack.get(pointer);
        stack.set(pointer, null);
        pointer--;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CISStack{stack=" + stack + ", size=" + size + ", pointer=" + pointer + "}";
    }
}