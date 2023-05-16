package p1;

public class Stack_Demo {

	public static void main(String[] args) {
		Stacks stack = new Stacks(5);
		stack.insert(1);
		stack.insert(2);
		stack.insert(3);
		stack.insert(4);
		stack.insert(5);
		System.out.println(stack.pop());
		stack.insert(6);
		System.out.println(stack.pop());
		stack.insert(8);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}

}
