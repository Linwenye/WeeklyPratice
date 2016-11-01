package week8;

public class CycleList {
	Node head, tail; // 头指针，尾指针
	int size;
	public CycleList() {
		size = 0;
		head = tail = null;
	}

	public void addhead(int i) {
		head = new Node(i, head);

		if (tail == null)
			tail = head;
		size++;
	}

	public void addtail(int i) {
		tail.next = new Node(i);
		tail.next.pre=tail;
		tail = tail.next;
		tail.next = head;
		head.pre=tail;		
		size++;
	}
	public void remove(Node p){
		p.pre.next=p.next;
		p.next.pre=p.pre;
		size--;
	}

	class Node // 节点类
	{
		int no; 
		Node next; // 下一个节点
		Node pre;
		public Node(int no) {

			this(no, null);
		}

		public Node(int no, Node next) 
		{
			this.no = no;
			this.next = next;
		}



	}
}