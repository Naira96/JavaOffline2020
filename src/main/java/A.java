public class A implements AI {

    private int stack[];
    private int index;

    public A(int size) {
        stack = new int[size];
        index = -1;
    }

    @Override
    public void push(int a) {
        if (index == stack.length - 1) {
            int tmp[] = new int[stack.length * 2];
            System.arraycopy(stack, 0, tmp, 0, stack.length);
            stack = tmp;
        } else stack[++index] = a;
    }

    @Override
    public int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stack[index--];
        }
    }


}