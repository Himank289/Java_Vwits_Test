package customer;

import java.util.Stack;

//Custom exception for stack full
class StackFullException extends Exception {
 public StackFullException(String message) {
     super(message);
 }
}

//Custom exception for stack empty
class StackEmptyException extends Exception {
 public StackEmptyException(String message) {
     super(message);
 }
}

//Stack implementation using Stack collection
class CustomStack {
 private Stack<Integer> stack;
 private int maxSize;


 public CustomStack(int size) {
     stack = new Stack<>();
     maxSize = size;
 }

 // Push operation
 public void push(int value) throws StackFullException {
     if (stack.size() == maxSize) {
         throw new StackFullException("Stack is full");
     }
     stack.push(value);
 }

 // Pop operation
 public int pop() throws StackEmptyException {
     if (stack.isEmpty()) {
         throw new StackEmptyException("Stack is empty");
     }
     return stack.pop();
 }

 
 public boolean isEmpty() {
     return stack.isEmpty();
 }


 public boolean isFull() {
     return stack.size() == maxSize;
 }
}

public class ExceptionEx {
 public static void main(String[] args) {
     CustomStack stack = new CustomStack(3);

     try {
         stack.push(1);
         stack.push(2);
         stack.push(3);
//          stack.push(4); // Uncomment to test StackFullException
     } catch (StackFullException e) {
         System.out.println("Caught StackFullException: " + e.getMessage());
     }

     try {
         while (!stack.isEmpty()) {
             System.out.println(stack.pop());
         }
//          stack.pop(); // Uncomment to test StackEmptyException
     } catch (StackEmptyException e) {
         System.out.println("Caught StackEmptyException: " + e.getMessage());
     }
 }
}
