package week10;

public class InfixCal {
	static String a = "3+8*2/(13-2)";

	public static void main(String[] args) {
		Stack staOpe = new Stack();
		Stack staNum = new Stack();
		String tem = "";
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) != '*' && a.charAt(i) != '/' && a.charAt(i) != '+' && a.charAt(i) != '-'
					&& a.charAt(i) != '(' && a.charAt(i) != ')') {
				tem = tem + a.charAt(i);
			} else {
				if (tem != "") {
					try {
						staNum.push(Double.valueOf(tem));
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				tem = "";
				if (staOpe.isEmpty() || a.charAt(i) == '(') {
					staOpe.push(a.charAt(i));
				} else {
					if (a.charAt(i) == ')') {
						char e = (char) staOpe.pop();
						while (e != '(') {
							staNum.push(cal(e, (double) staNum.pop(), (double) staNum.pop()));
							e = (char) staOpe.pop();
						}
					} else {
					
						if (prior(a.charAt(i), (char) staOpe.peek())||(char)staOpe.peek()=='(') {
							staOpe.push(a.charAt(i));
						} else {
							staNum.push(cal((char) staOpe.pop(), (double) staNum.pop(), (double) staNum.pop()));
							staOpe.push(a.charAt(i));
						
						}
					}
				}
			}
		}
		while (!staOpe.isEmpty()) {
			staNum.push(cal((char) staOpe.pop(), (double) staNum.pop(), (double) staNum.pop()));
		}
		System.out.println((double) staNum.peek());
	}

	static int prior(char a) {
		int res = -1;
		switch (a) {
		case '*':
			res = 1;
			break;
		case '/':
			res = 1;
			break;
		case '+':
			res = 0;
			break;
		case '-':
			res = 0;
			break;
		case '(':
			res = 2;
			break;
		}
		return res;
	}

	static double cal(char o, double a, double b) {
		double res = -1;
		switch (o) {
		case '*':
			res = a * b;
			break;
		case '/':
			res = b / a;
			break;
		case '+':
			res = a + b;
			break;
		case '-':
			res = b - a;
			break;

		}
		return res;
	}

	static boolean prior(char a, char b) {
		return prior(a) > prior(b);
	}
}
