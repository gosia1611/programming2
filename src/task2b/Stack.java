package task2b;

import java.util.ArrayList;

/** 
 * Class implements stack
 * @author Gosia
 *
 */
public class Stack {
	@SuppressWarnings("rawtypes")
	ArrayList values;
	int size;
	int top;

	@SuppressWarnings("rawtypes")
	public Stack(int size) {
		values = new ArrayList();
		this.size = size;
		this.top = -1;
	}

	/**
	 * Checks if stack is empty
	 * @return true is is empty, otherwise false
	 */
	private boolean isEmpty() {
		if(this.top == 0) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	/**
	 * Pushes element to stack
	 * @param element to push on stack
	 */
	@SuppressWarnings("unchecked")
	public void push(Object element) {
		if(top == size-1) {
			System.out.println("Stack is full");
		} else {
			this.top++;
			values.add(element);
			System.out.println("Element " + element + " is on stack");
		}
	}

	/**
	 * Removes element from stack
	 * @return removed element from stack
	 */
	public Object pop() {
		isEmpty();
		Object valuesOnTop = values.get(top);
		System.out.println("Element " + valuesOnTop.toString() + " is removed from stack");
		this.top--;
		return valuesOnTop;
	}

	/**
	 * Displays stack
	 */
	public void display() {
		if(!isEmpty()) {
			System.out.println("Values on stack:");
			for(int i=top; i>=0; i--) {
				System.out.println(i + ": " + values.get(i).toString());
			}
		}
	}
}