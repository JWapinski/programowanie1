package day2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyCustomStackTest {

    @Test
    void init_test() {
        MyCustomStack stack = new MyCustomStack(5);
        Assertions.assertEquals(stack.getSize(), 0);
        Assertions.assertEquals(stack.getCapacity(), 5);
        // stack.printStack();
    }

    @Test
    void push_test() {
        MyCustomStack stack = new MyCustomStack(5);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");
        Assertions.assertEquals(stack.getSize(), 5);

        Assertions.assertThrows(StackIsFullException.class, () -> stack.push("Z"));
        Assertions.assertEquals(stack.getSize(), 5);
        // stack.printStack();
    }

    @Test
    void peek_test() {
        MyCustomStack stack = new MyCustomStack(5);
        Assertions.assertEquals(stack.peek(), null);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        Assertions.assertEquals(stack.peek(), "C");
        Assertions.assertEquals(stack.peek(), "C");
        Assertions.assertEquals(stack.peek(), "C");
    }

    @Test
    void pop_test() {
        MyCustomStack stack = new MyCustomStack(5);
        Assertions.assertEquals(stack.pop(), null);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        Assertions.assertEquals(stack.pop(), "C");
        Assertions.assertEquals(stack.pop(), "B");
        Assertions.assertEquals(stack.pop(), "A");
    }

}
