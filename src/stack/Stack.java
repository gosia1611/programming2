package stack;

/** 
 * Class implements stack
 * @author Gosia
 *
 */
public class Stack {
	int[] values;
	int size;
	int onTop;

	public Stack(int size) {
		values = new int[size];
		this.size = size;
		this.onTop = 0;
	}

	/**
	 * Checks if stack is empty
	 * @return true is is empty, otherwise false
	 */
	private boolean isEmpty() {
		if(this.onTop == 0) {
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
		if(onTop == size) {
			System.out.println("Stack is full");
		} else {
			values[onTop] = element;
			this.onTop++;
			System.out.println("Element " + element + " is on stack");
		}
	}

	/**
	 * Removes element from stack
	 * @return removed element from stack
	 */
	public int pop() {
		isEmpty();
		this.onTop--;
		System.out.println("Element " + values[onTop] + " is removed from stack");
		return values[onTop];
	}

	/**
	 * Displays stack
	 */
	public void display() {
		if(!isEmpty()) {
			System.out.println("Values on stack:");
			for(int i=onTop-1; i>=0; i--) {
				System.out.println(i + ": " + values[i]);
			}
		}
	}
}