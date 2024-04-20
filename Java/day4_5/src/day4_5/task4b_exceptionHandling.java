/*
 Develop a CustomQueue class with methods for Enqueue, Dequeue, Peek and isEmpty. Show how your queue can handle different data types by enqueuing strings and integers, then dequeuing and displaying them to confirm FIFO order.
 */

package day4_5;

import java.util.LinkedList;
import java.util.Queue;

public class task4b_exceptionHandling {

	public static void main(String[] args) {
		CustomQueue<Object> queue = new CustomQueue<>();
		System.out.println("Demonstrating queue");
		queue.enqueue("First");
		System.out.println("Added First");
		queue.enqueue(2);
		System.out.println("Added 2");
		queue.enqueue("Third");
		System.out.println("Added Third");
		System.out.println("Dequeued : "+queue.dequeue());
		System.out.println("Dequeued : "+queue.dequeue());
		System.out.println("Dequeued : "+queue.dequeue());
		

	}

}

class CustomQueue<T>{
	private Queue<T> queue;
	public CustomQueue() {
		queue = new LinkedList<>();
	}
	public void enqueue(T item) {
		queue.add(item);
	}
	public T dequeue() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue.poll();
	}
	public T peek() {
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}
		return queue.peek();
	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
}
