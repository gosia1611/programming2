package task2b;

public class Main {

	public static void main (String[] args) {
		Stack stack = new Stack(3);
		stack.display();
		stack.push("abc");
		stack.push(5);
		stack.push(6.3);
		stack.push(2);
		stack.display();
		stack.pop();
		stack.display();
	}
}