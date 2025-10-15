package org.example.task2;

public class IntStack {
    private int[] stack;

    public IntStack() {
        this.stack = new int[0];
    }

    public int pop() {
        if (stack.length == 0) {
            throw new RuntimeException("Unable to pop element from an empty stack");
        }

        int popped = stack[stack.length - 1];

        int[] stackNew = new int[stack.length - 1];
        for (int i = 0; i < stackNew.length; i++) {
            stackNew[i] = stack[i];
        }
        stack = stackNew;

        return popped;
    }

    public void push(int elementNew) {
        int[] stackNew = new int[stack.length + 1];
        for (int i = 0; i < stack.length; i++) {
            stackNew[i] = stack[i];
        }
        stackNew[stack.length] = elementNew;

        stack = stackNew;
    }

    public int peek() {
        if (stack.length == 0) {
            throw new RuntimeException("Unable to peek element in an empty stack");
        }
        return stack[stack.length - 1];
    }

    public int size() {
        return stack.length;
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }

    public void clear() {
        stack = new int[0];
    }
}
