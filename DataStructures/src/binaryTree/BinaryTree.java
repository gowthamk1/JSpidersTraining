package binaryTree;

public class BinaryTree {
		String[] arr;
		int index;
			
		public BinaryTree(int size) {
			arr=new String[size+1];
			index=0;
			System.out.println("Tree is crested with the size of "+size);
		}
			
		public boolean isFull() {
			return index == arr.length-1;
		}
		
		public void insertion(String value) {
			if(! isFull()) {
				arr [index+1]=value; 
				index++;
				System.out.println("the value "+value+" is inserted");
			}
			else {
				System.out.println("Tree is full");
			}
		}
		
		public void preOrder(int root) {
			if(root>index) {
				return;
			}
			else {
				System.out.println(arr[root]+ " ");
				preOrder(root*2);
				preOrder(root*2+1);
			}
		}
		public void inOrder(int root) {
			if(root>index) {
				return;
			}else {
				inOrder(root*2);
				System.out.println(arr[root]+" ");
				inOrder(root*2+1);
			}
		}
		public void postOrder(int root) {
			if(root>index) {
				return;
			}else {
				postOrder(root*2);
				postOrder(root*2+1);
				System.out.println(arr[root]+" ");
			}
		}
		public static void main(String[] args) {
			BinaryTree tree=new BinaryTree(6);
			tree. insertion ("10"); 
			tree. insertion ("20"); 
			tree. insertion ("30"); 
			tree. insertion("40"); 
			tree.insertion("50"); 
			tree. insertion ("10"); 
			tree.insertion("10");
			System.out.println("PRE-ORDER");
			tree.preOrder(1);
			System.out.println("IN-ORDER");
			tree.inOrder(1);
			System.out.println("POST-ORDER");
			tree.postOrder(1);
		}
}
