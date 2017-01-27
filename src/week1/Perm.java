package week1;

import java.time.LocalDate;

public class Perm {
	
	static int a[] = { 1, 2, 3, 4, 5 };

	static void perm(int a[],int k,int m) {
			if (k == m) {
				for(int p:a){
					System.out.print(p);
				}
				System.out.println();
				
			}
			else{
				
				for(int i1=k;i1<m;i1++){
					int temp=a[k];
					a[k]= a[i1];
					a[i1]=temp;
					perm(a,k+1,m);
					a[i1]=a[k];
					a[k]= temp;
				}
		}
	}
	public static void main(String[] args) {
		perm(a, 0, a.length);
//		System.out.println(LocalDate.of(2016, 2, 3).toString());
	}
}
