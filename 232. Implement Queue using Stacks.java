import java.util.Stack;

class MyQueue {
    Stack<Integer> st; // Stack for pushing elements
    Stack<Integer> val; // Stack for retrieving elements

    public MyQueue() {
        st = new Stack<>();
        val = new Stack<>();
    }

    public void push(int x) {
        st.push(x); // Always push to the input stack
    }

    public int pop() {
        if (val.isEmpty()) {
            // Transfer elements from st to val only if val is empty
            while (!st.isEmpty()) {
                val.push(st.pop());
            }
        }
        if (val.isEmpty()) {
            return -1; // Queue is empty
        }
        return val.pop(); // Remove and return the front element
    }

    public int peek() {
        if (val.isEmpty()) {
            // Transfer elements from st to val only if val is empty
            while (!st.isEmpty()) {
                val.push(st.pop());
            }
        }
        if (val.isEmpty()) {
            return -1; // Queue is empty
        }
        return val.peek(); // Return the front element without removing it
    }

    public boolean empty() {
        return st.isEmpty() && val.isEmpty(); // Queue is empty if both stacks are empty
    }
}

/**
 * Example usage:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
