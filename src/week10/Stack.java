package week10;

import java.util.LinkedList;
import java.util.List;

public class Stack {
	private List<Object> l;

	public Stack() {
		l = new LinkedList<>();
	}
	public boolean isEmpty(){
		return l.isEmpty();
	}
	public Object pop() throws IndexOutOfBoundsException {
		Object x = l.get(0);
		l.remove(0);
		return x;
	}

	public Object peek() throws IndexOutOfBoundsException {
		Object x = l.get(0);
		return x;
	}

	public void push(char e) throws IndexOutOfBoundsException {
		l.add(0, e);
	}

	public void push(double e) throws IndexOutOfBoundsException {
		l.add(0, e);
	}
}
