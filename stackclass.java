package github.pkg2;

import java.util.Scanner;

interface stack {

    void push(int x);

    int pop();
}

class stack1 implements stack {

    private int[] stacksize;
    private int top;

    stack1(int size) {
        stacksize = new int[size];
        top = -1;
    }

    public void push(int x) {
        if (top == stacksize.length - 1) {
            System.out.println("Stack is full.");
        } else {
            stacksize[++top] = x;
        }
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack empty.");
            return 0;
        } else {
            return stacksize[top--];
        }
    }

    public int show() {
        return stacksize[top];

    }

}

public class stackclass {

    public static void main(String[] args) {

        System.out.println("take the number of cans shot by Harry and by Larry respectively:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("cans shot by Harry :" + a);
        int b = scan.nextInt();
        System.out.println("cans shot by Larry :" + b);

        if ((a + b) > 11) {

            System.out.println("total number of cans can not exceed 10");
            return;
        }
        stack1 mystack1 = new stack1(10);
        stack1 mystack2 = new stack1(10);

        for (int i = 1; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 1; i < 10; i++) {
            mystack2.push(i);
        }

        for (int i = 1; i < a; i++) {
            mystack1.pop();
        }

        for (int i = 1; i < b; i++) {
            mystack2.pop();

        }
        System.out.println("");
        System.out.println("cans that were not shot by Harry: " + mystack1.show());
        System.out.println("cans that were not shot by Larry: " + mystack2.show());

    }
}
