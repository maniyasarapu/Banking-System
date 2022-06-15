
import java.util.*;

public class StkArr {
    static final int max = 1000;
    int top;
    int a[] = new int[max];

    StkArr() {
        top = -1;
    }

    boolean empty() {
        System.out.println(top);
        if (top < 0) {
            return true;
        }
        return false;
    }

    void push(int n) {
        if (top != max) {
            a[++top] = n;

        } else {
            System.out.println("stack is full");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("stack is Empty");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top == -1) {
            return -1;
        } else {
            return a[top];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        StkArr stk = new StkArr();
        boolean res = stk.empty();
        System.out.println(res);
        int pop_ele = stk.pop();
        System.out.println(pop_ele);
        stk.push(10);
        stk.push(120);
        stk.push(530);
        stk.print();

    }

}