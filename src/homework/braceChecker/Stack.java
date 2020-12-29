package homework.braceChecker;

public class Stack {

    private char[] stack;
    private int index;


    public Stack(int size) {
        stack = new char[size];
        index = -1;
    }

    public void push(char brace) {
        if (index == stack.length - 1) {
            char[] temp = new char[stack.length * 2];
            System.arraycopy(stack, 0, temp, 0, stack.length);
            stack = temp;
        } else stack[++index] = brace;
    }

    public char pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return 0;
        }
        return stack[index--];
    }

}
