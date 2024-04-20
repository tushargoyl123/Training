/*
 Create a customStack Class with operations push, pop, peek, isEmpty. Demonstrate its LIFO behaviour by pushing integers onto the stack, then popping and displaying them until the stack is empty.
 */

package day4_5;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class task4a_exceptionHandling {

	public static void main(String[] args) {
		customStack<Integer> stack = new customStack<>();
		System.out.println("CustomStack Demonstration");
		stack.push(1);
		System.out.println("Added 1");
		stack.push(2);
		System.out.println("Added 2");
		stack.push(3);
		System.out.println("Added 3");
		while(!(stack.isEmpty())) {
			System.out.println("Popped "+stack.pop());
		}
		

	}

}
class customStack<T>{
	private List<T> stack;
	public customStack() {
		stack = new ArrayList<>();
	}
	public void push(T item) {
		stack.add(item);
	}
	public T pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.remove(stack.size()-1);
	}
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack.get(stack.size()-1);
	}
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
