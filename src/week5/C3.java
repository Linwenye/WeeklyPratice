package week5;

import java.util.ArrayList;
import java.util.List;

public class C3 {
	static int[] what = { 1, 2, 3, 4, 5 ,6,7};
	static int[] x = { 0};
	static int n=what.length;
	public static void main(String[] args) {
		sort(x, what, 2, 0);
	}

	// private static void sort(List x, int[] a2, int r) {
	// // TODO Auto-generated method stub
	//
	// }

	private static void sort(int[] p, int[] a, int r, int k) {
		if (r == 1) {
			for (int j = 0; j < a.length; j++) {
				for (int i = 0; i < p.length; i++) {

					System.out.print(p[i]);
				}
				System.out.print(a[j]);
				System.out.println();

			}
		} else {

			for (int i = a.length - 1; i>0 ; i--) {

				int b[] = new int[i];
				for (int j = 0; j < i; j++) {
					b[j] = a[j];
				}
				int pp[] = p.clone();
				pp[k] = a[i];
				sort(pp, b, r - 1, k + 1);
			}

		}
	}
}