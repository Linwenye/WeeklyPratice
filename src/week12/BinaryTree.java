package week12;

import java.util.Scanner;

public class BinaryTree {

	private class BinaryNode {
		BinaryNode() {
			left = right = null;
		}

		BinaryNode(int e) {
			element = e;
			left = right = null;
		}

		BinaryNode(int e, BinaryNode l, BinaryNode r) {
			element = e;
			left = l;
			right = r;
		}

		int element;
		BinaryNode left; // left subtree
		BinaryNode right; // right subtree
	}

	private BinaryNode root;

	public BinaryTree() {
		this.root = null;
	}

	public boolean isEmpty() {
		return ((root != null) ? false : true);
	}

	public BinaryNode makeTree() {
		int data;
		Scanner scanner = new Scanner(System.in);
		data = scanner.nextInt();
		if (data == 0)
			return null;
		else {
			if (root == null) {
				root = new BinaryNode(data);
				root.left = makeTree();
				root.right = makeTree();
				return root;
			} else {
				BinaryNode node = new BinaryNode(data);
				node.left = makeTree();
				node.right = makeTree();
				return node;
			}
			
		}
		
	}

	public void preOrder() {
		if (root != null) {
			System.out.print(root.element);
			System.out.print(" ");
			if(root.left!=null)preOrder(root.left);
			if(root.right!=null)preOrder(root.right);
		}
	}

	private void preOrder(BinaryNode node) {
		System.out.print(node.element);
		System.out.print(" ");
		if(node.left!=null)preOrder(node.left);
		if(node.right!=null)preOrder(node.right);
	}

	public void inOrder() {
		if (root != null) {
		
			if(root.left!=null)inOrder(root.left);
			System.out.print(root.element);
			System.out.print(" ");
			if(root.right!=null)inOrder(root.right);
		}
	}
	

	private void inOrder(BinaryNode node) {
		
		if(node.left!=null)inOrder(node.left);
		System.out.print(node.element);
		System.out.print(" ");
		if(node.right!=null)inOrder(node.right);
	}

	public void postOrder() {
		if (root != null) {
			
			if(root.left!=null)postOrder(root.left);	
			if(root.right!=null)postOrder(root.right);
			System.out.print(root.element);
			System.out.print(" ");
		}
	}

	private void postOrder(BinaryNode node) {
		if(node.left!=null)postOrder(node.left);
		if(node.right!=null)postOrder(node.right);		
		System.out.print(node.element);
		System.out.print(" ");
	}
}
