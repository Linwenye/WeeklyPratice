package week8;

public class MyList {
	Node head, tail;
	int size;

	public MyList() {
		size = 0;
		head = tail = null;
	}

	class Node {
		public int cof;
		public int exp;
		Node pre;
		Node next;

		public Node(int cof, int exp) {
			this.cof = cof;
			this.exp = exp;
		}

	}

	public void addhead(int cof, int ex) {
		if (head != null) {
			head.pre = new Node(cof, ex);
			head.pre.next = head;
			head=head.pre;
		} else {
			head = new Node(cof, ex);
		}
		if (tail == null)
			tail = head;
		size++;
	}

	public void addtail(int c, int e) {
		tail.next = new Node(c, e);
		tail.next.pre = tail;
		tail = tail.next;
		size++;
	}

	public void remove(Node p) {
		p.pre.next = p.next;
		p.next.pre = p.pre;
		size--;
	}
	public void addBefore(Node p,Node p2){
		p2.next=p;
		p2.pre=p.pre;
		p.pre.next=p2;
		p.pre=p2;
	}
}
