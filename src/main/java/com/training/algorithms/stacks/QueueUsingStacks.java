package com.training.algorithms.stacks;

import java.util.Stack;

public class QueueUsingStacks {

  private Stack<Integer> temp;
  private Stack<Integer> value;

  QueueUsingStacks() {
    temp = new Stack<>();
    value = new Stack<>();
  }

  // push elements to the back of the queue
  public void push(int x) {
    if (value.isEmpty()) {
      value.push(x);
    } else {
      while (!value.isEmpty()) {
        temp.push(value.pop());
      }
      value.push(x);
      while (!temp.isEmpty()) {
        value.push(temp.pop());
      }
    }
  }

  // Removes the element from infront of queue
  public void pop() {
    value.pop();
  }

  public int peek() {
    return value.peek();
  }

  public boolean empty() {
    return value.isEmpty();
  }
}
