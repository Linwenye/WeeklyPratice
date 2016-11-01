package week5;

public class Hanoi {
	static int host[][]={{5,4,3,2,1},{0,0,0,0,0},{0,0,0,0,0}};
//	int temp[]={0,0,0,0,0};
//	int aim[]={0,0,0,0,0};
	
	public static void main(String []args){
		hanoi(5,0,1,2);
	}
	private static int gettop(int []a){
		for(int j=a.length-1;j>=0;j--){
			if(a[j]!=0)
				return j;
		}
		return -1;
	}
	
	private static void hanoi(int n,int from,int mid,int to){
		if(n==1){
			int num=host[from][gettop(host[from])];
			host[from][gettop(host[from])]=0;
			host[to][gettop(host[to])+1]=num;
			for(int i=0;i<host.length;i++){
				for(int j=0;j<host[0].length;j++){
					System.out.print(host[i][j]);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		else{
			// move n-1 from present to mid
			hanoi(n-1,from,to,mid);
			//move the biggest one
			int num=host[from][gettop(host[from])];
			host[from][gettop(host[from])]=0;
			host[to][gettop(host[to])+1]=num;
			for(int i=0;i<host.length;i++){
				for(int j=0;j<host[0].length;j++){
					System.out.print(host[i][j]);
				}
				System.out.print("  ");
			}
			System.out.println();
			
			//move n-1 from mid to aim;
			hanoi(n-1,mid,from,to);
			
		}
	}
}
