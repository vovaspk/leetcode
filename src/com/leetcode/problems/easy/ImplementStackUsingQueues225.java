package com.leetcode.problems.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementStackUsingQueues225 {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty()); // return False

    }

    static class MyStack {
        Queue<Integer> queue;
        public MyStack() {
            queue = new ArrayDeque<>();
        }

        //Pushes element x to the top of the stack.
        public void push(int x) {
            queue.offer(x);
            for (int i = 0; i < queue.size() - 1; i++) {
                queue.add(queue.poll());
            }
        }
    //    int pop() Removes the element on the top of the stack and returns it.
        public int pop() {
            return queue.poll();
        }
    //    int top() Returns the element on the top of the stack.
        public int top() {
            return queue.peek();
        }
    //    boolean empty() Returns true if the stack is empty, false otherwise.
        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
