package stack;

public class Main {

	public static void main (String[] args) {
		Stack stack = new Stack(3);
		stack.display();
		stack.push(8);
		stack.push(5);
		stack.push(6);
		stack.push(2);
		stack.display();
		stack.pop();
		stack.display();
	}
}