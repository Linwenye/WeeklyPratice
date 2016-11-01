package week8;

public class JosephusArray {
	public static void main(String args[]) {

		jos(8, 3);

	}

	static void jos(int n, int m) {
		int a[] = new int[n];
		int status[] = new int[n];
		int time = 0;
		int cur = 0;
		for (int i = 0; i < n; i++) {
			status[i] = 1;
		}
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		int t = 1;
		while (time != n) {
			if (t == m) {
				if (status[cur] == 1) {
					status[cur] = 0;
					time++;
					System.out.println(a[cur]);
					if (cur == n - 1) {
						cur = 0;
					} else
						cur++;
					t=1;
				} else {
					if (cur == n - 1) {
						cur = 0;
					} else
						cur++;
				}
			}
			else{
				if (status[cur] == 1) {
					if (cur == n - 1) {
						cur = 0;
					} else
						cur++;
					t++;
				} else {
					if (cur == n - 1) {
						cur = 0;
					} else
						cur++;
				}
				
			}
		}
	}
}
