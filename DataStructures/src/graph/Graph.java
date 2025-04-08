package graph;

import java.util.ArrayList;
import java.util.Stack;

class Node {
	public String value;
	public int index;
	public boolean isvisited;

	protected Node(String value, int index) {
		super();
		this.value = value;
		this.index = index;
	}

	public String getValue() {
		return value;
	}

}

public class Graph {
	int[][] adjacentMatrix;
	ArrayList<Node> a1 = new ArrayList<Node>();

	public Graph(ArrayList<Node> a1) {
		this.a1 = a1;
		adjacentMatrix = new int[a1.size()][a1.size()];
	}

	public void visited(int row, int col) {
		adjacentMatrix[row][col] = adjacentMatrix[col][row] = 1;
	}

	public void printGraph() {
		for (int i = 0; i < adjacentMatrix.length; i++) {
			System.out.print("  " + a1.get(i).value + "");
		}
		System.out.println();
		for (int i = 0; i < adjacentMatrix.length; i++) {
			System.out.print(a1.get(i).value + "");
			for (int no : adjacentMatrix[i]) {
				System.out.print(" " + no + " ");
			}
			System.out.println();
		}

	}
	public ArrayList<Node> neighbors(Node node) {
		ArrayList<Node> neighbor=new ArrayList<Node>();
		int index=node.index;
		for(int i=0;i<adjacentMatrix.length;i++) {
			if(adjacentMatrix[index][i]==1) {
				neighbor.add(a1.get(i));
			}
		}
		return neighbor;
	}
//		public void bfsNode(Node node) {
//			ArrayList<Node> queue=new ArrayList<Node>();
//			queue.add(node);
//			while(! queue.isEmpty()) {
//				Node currentNode=queue.remove(0);
//				currentNode.isvisited=true;
//				System.out.print(currentNode.value+" ");
//				ArrayList<Node> neighbors=neighbors(currentNode);
//				for(Node neighbor:neighbors) {
//					if(! neighbor.isvisited) {
//						queue.add(neighbor);
//						neighbor.isvisited=true;
//					}
//				}
//				
//				
//			}
//		}
//		public void bfs() {
//			for(Node source:a1) {
//				if(!source.isvisited) {
//					bfsNode(source);
//				}
//			}
//		}
		
//		(************************DFS***************************)
		public void dfsNode(Node node) {
			Stack<Node> stack=new Stack<Node>();
			stack.push(node);
			while(! stack.isEmpty()) {
				Node currentNode=stack.pop();
				currentNode.isvisited=true;
				System.out.print(currentNode.value+" ");
				ArrayList<Node> neighbors=neighbors(currentNode);
				for(Node neighbor:neighbors) {
					if(! neighbor.isvisited) {
						stack.push(neighbor);
						neighbor.isvisited=true;
					}
				}
				
				
			}
		}
		public void dfs() {
			for(Node source:a1) {
				if(!source.isvisited) {
					dfsNode(source);
				}
			}
		}
}