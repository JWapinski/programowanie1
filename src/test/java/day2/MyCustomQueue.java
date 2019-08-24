package day2;

public class MyCustomQueue implements IMyCustomQueue {
    private String[] stack;
    private int size;
    private int head;

    public MyCustomQueue(int capacity) {
        this.stack = new String[capacity];
        this.size = 0;
        this.head = 0;
    }

    @Override
    public void push(String object) {
        if (isFull()) {
            throw new QueueIsFullException();
        } else {
            this.stack[this.head] = object;
            this.head++;
            this.size++;
        }
    }

    @Override
    public String pop() {
        if (isEmpty()) {
            return null;
        } else {
            String tempObject = this.stack[this.head - 1];
            this.stack[this.head - 1] = null;
            this.size--;
            this.head--;
            return tempObject;
        }
    }

    @Override
    public String peek() {
        if (isEmpty()) {
            return null;
        } else {
            return this.stack[this.head - 1];
        }
    }

    public boolean isFull() {
        return this.size == this.stack.length;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.stack.length;
    }

    public void printStack() {
        // Arrays.stream(this.stack).filter(element -> element != null).forEach(System.out::println);

        for (int i = 0; i < this.size; i++) {
            System.out.println(this.stack[i]);
        }
    }


}

class QueueIsFullException extends RuntimeException {

}


