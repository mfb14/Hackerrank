
package hackerrank;

import java.util.HashSet;

/**
 * 
 * @author Mustafa Furkan BİLEN <mustafafurkanbilen@gmail.com>
 * @since Dec 2, 2022 7:20:54 PM
 */

 class Node {
	Node right;
	Node left;
	Node(){
		this.left=this.right=null;
	}
}
 class BinaryTree{
	public int numberOfEdges=0;
	public int numberOfNull=0;
	public int numberOfLeftNodes=0;
	public int numberOfRightNodes=0;
	public HashSet<Node> nodes = new HashSet<>();
	
	Node root;
	
	void traverse(Node node) {
		if(node==null) {
			//numberOfNull++;
			return;	
		}
		
		traverse(node.left);
		traverse(node.right);
		
	}
	public boolean searcher(Node node) {
		if(node==null) {
			numberOfNull++;
			return false;
		}
		if(searcher(node.left)==true) {
			numberOfEdges++;
		}
		if(searcher(node.right)==true) {
			numberOfEdges++;
		}
		nodes.add(node);
		return true;	
	}
	boolean isAnomaly() {
		return nodes.size()-1==numberOfEdges?true:false;
	}
	
	void traversal(Node node) {
		Node iter, previous;
		Node temp;
		if(node==null)
			return;
		
		iter=node;
		
		while(iter!=null) {
			if(iter.left==null) {
				System.out.println("NodeRight:"+ ++numberOfRightNodes);
				nodes.add(iter);
				iter=iter.right;
				
			}
			else {
				previous=iter.left;
				while(previous.right!=null&&previous.right!=iter)
					previous=previous.right;
				
				if(previous.right==null) {
					previous.right=iter;
					iter=iter.left;
				}		
				else {
					previous.right=null;
					System.out.println("NodeLeft:"+ ++numberOfLeftNodes);
					nodes.add(iter);
					iter=iter.right;
				}
			}
			
		}
	}

}

public class BinaryTreeWithoutData {


	public static void main(String[] args) {
		
		Node n1 = new Node();
		Node n2 = new Node(); 
		Node n3 = new Node();  
		Node n4 = new Node();  
		Node n5 = new Node(); 
		Node n6 = new Node(); 
		Node n7 = new Node(); 
		BinaryTree tree = new BinaryTree();
		tree.root=n1;
		tree.root.left=n2;
		tree.root.right=n3;
		tree.root.left.right=n4;
		tree.root.right.left=n5;
		tree.root.left.left=n6;
		tree.root.right.left.left=n7;
//		tree.root.left.right.right=tree.root.right.left.left;
		
		tree.traverse(tree.root);
		tree.searcher(tree.root);
		
		
		tree.traversal(tree.root);
		
		System.out.println(tree.isAnomaly());
	}

}
