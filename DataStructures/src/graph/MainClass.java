package graph;


import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Node> a1 = new ArrayList<Node>();
		a1.add(new Node("A", 0));
		a1.add(new Node("B", 1));
		a1.add(new Node("C", 2));
		a1.add(new Node("D", 3));
		a1.add(new Node("E", 4));

		Graph g1 = new Graph(a1);
		g1.printGraph();
		System.out.println("***********************************************");
		g1.visited(0, 1);
		g1.visited(0, 2);
		g1.visited(0, 3);
		g1.visited(0, 1);
		g1.visited(1, 4);
		g1.visited(2, 3);
		g1.visited(3, 4);
		g1.printGraph();
		System.out.println("**********************neighbours*************************");
		g1.neighbors(a1.get(3));
		System.out.println();
		System.out.println("***************bfs****************************");
//		g1.bfsNode(a1.get(0));
//		System.out.println();
//		System.out.println("***************bfs****************************");
//		g1.bfs();
		System.out.println();
		System.out.println("***************dfs****************************");
//		g1.dfsNode(a1.get(1));
		g1.dfs();
		
	}
}