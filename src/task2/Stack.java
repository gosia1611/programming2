package task2;

/** 
 * Class implements stack
 * @author Gosia
 *
 */
public class Stack {
	int[] values;
	int size;
	int top;

	public Stack(int size) {
		values = new int[size];
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
	public void push(int element) {
		if(top == size-1) {
			System.out.println("Stack is full");
		} else {
			this.top++;
			values[top] = element;
			System.out.println("Element " + element + " is on stack");
		}
	}

	/**
	 * Removes element from stack
	 * @return removed element from stack
	 */
	public int pop() {
		isEmpty();
		int valuesOnTop = values[top];
		System.out.println("Element " + values[top] + " is removed from stack");
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
				System.out.println(i + ": " + values[i]);
			}
		}
	}
}