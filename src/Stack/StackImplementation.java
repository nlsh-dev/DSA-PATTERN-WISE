package Stack;

public class StackImplementation {

    int[] arr;
    int top;
    int size;

    public StackImplementation(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    // Push
    public void push(int val) {

        if(top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = val;
    }

    // Pop
    public int pop() {

        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek
    public int peek() {

        if(top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return arr[top];
    }

    // Check Empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display
    public void display() {

        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        StackImplementation st = new StackImplementation(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack elements:");
        st.display();

        System.out.println("Top: " + st.peek());

        System.out.println("Popped: " + st.pop());

        System.out.println("After Pop:");
        st.display();

        System.out.println("Is Empty: " + st.isEmpty());
    }
}
