package week8;

import week8.MyList.Node;

public class Pol {

	public static void main(String args[]) {

		pol();

	}

	static void pol() {

		MyList a = new MyList();
		a.addhead(2, 100);
		a.addtail(3, 14);
		a.addtail(2, 8);
		a.addtail(1, 0);

		MyList b = new MyList();
		b.addhead(-2, 100);
		b.addtail(8, 14);
		b.addtail(-3, 10);
		b.addtail(10, 6);
		b.addtail(-1, 1);
		
		Node p1 = a.head;
		Node p2 = b.head;
		while (p1 != null && p2 != null) {
			if (p2.exp > p1.exp) {
				if (p1 == a.head) {
					a.addhead(p2.cof, p2.exp);
					p2=p2.next;
				} else {
					Node tem=p2.next;
					a.addBefore(p1, p2);
					p2=tem;
					
				}
			} else if (p2.exp < p1.exp) {
				p1=p1.next;
			} else if (p2.exp == p1.exp) {
				p1.cof = p1.cof + p2.cof;
//				if(p1.cof==0){
//					a.remove(p1);
//				}
				System.out.println(p1.cof);
				p1 = p1.next;
				p2 = p2.next;
			}
			
		}
		if (p1 == null) {
			a.addtail(p2.cof, p2.exp);
			b.remove(p2.pre);

		}
		Node res=a.head;
		while(res!=null){
			System.out.print(res.cof+"x^"+res.exp+"+");
			res=res.next;
		}
	}
}
