package week12;

public class PrintTree {
	public static void main(String args[]) {
//		int[]a ={1,2,3,0,0,0,4,0,0};
		BinaryTree mainTree=new BinaryTree();
		mainTree.makeTree();
		
		mainTree.inOrder();
		System.out.println();
		
		mainTree.preOrder();
		System.out.println();
		
		mainTree.postOrder();
		
	}
}
