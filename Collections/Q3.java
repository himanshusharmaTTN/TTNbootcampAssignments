//Q3. Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() and
//  an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity O(1))

import java.util.Stack;

class SpecialStack {

    private Stack<Integer> mainStack;
    private Stack<Integer> minStack;
    private int maxSize;

    public SpecialStack(int size) {
        this.maxSize = size;
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public boolean isFull() {
        return mainStack.size() == maxSize;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        mainStack.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        int removed = mainStack.pop();

        if (removed == minStack.peek()) {
            minStack.pop();
        }

        return removed;
    }

    public int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return minStack.peek();
    }
}


 class SpecialStackDemo {

    public static void main(String[] args) {

        SpecialStack s = new SpecialStack(5);

        s.push(5);
        System.out.println("Min: " + s.getMin());

        s.push(2);
        System.out.println("Min: " + s.getMin());

        s.push(8);
        System.out.println("Min: " + s.getMin());

        s.push(1);
        System.out.println("Min: " + s.getMin());

        s.push(3);
        System.out.println("Min: " + s.getMin());

        s.pop();
        System.out.println("Min after pop: " + s.getMin());

        s.pop();
        System.out.println("Min after pop: " + s.getMin());
    }
}
