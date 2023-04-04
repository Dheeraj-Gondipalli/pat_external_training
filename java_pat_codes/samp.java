import java.util.*;

public class samp {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println("Original Stack: " + stack);

        Stack<Integer> reversedStack = reverseStack(stack);

        System.out.println("Reversed Stack: " + reversedStack);
    }

    public static Stack<Integer> reverseStack(Stack<Integer> stack) {
        Stack<Integer> reversedStack = new Stack<>();
        while (!stack.isEmpty()) {
            reversedStack.push(stack.pop());
        }
        return reversedStack;
    }
}