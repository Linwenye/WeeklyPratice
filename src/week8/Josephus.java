package week8;

import week8.CycleList.Node;

public class Josephus {
	public static void main(String args[]) {

		jos(8, 3);

	}

	static void jos(int n, int m) {
		CycleList cl = new CycleList();
		cl.addhead(1);
		for (int i = 2; i <= n; i++) {
			cl.addtail(i);
		}
		Node p = cl.tail;
		while (cl.size != 0) {
			for (int i = 0; i < m; i++) {
				p = p.next;
				
			}
			System.out.println(p.no);
			cl.remove(p);
		}
	}
}
