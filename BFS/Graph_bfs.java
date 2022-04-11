
import java.util.*;

public class Graph_bfs {

	private int noOfVertices; 
	private LinkedList<Integer> adjacencyList[];
	
	public Graph_bfs(int noOfVertices) {
		super();
		this.noOfVertices = noOfVertices;
		this.adjacencyList = new LinkedList[noOfVertices];
        for (int i=0; i<noOfVertices; ++i)
        	adjacencyList[i] = new LinkedList();
    
	}
	
	//Method for add edges to the graph
	void addEdge(int noOfVertices,int w)
    {
		adjacencyList[noOfVertices].add(w);
    }

	public int getnoOfVertices() {
		return noOfVertices;
	}

	public LinkedList<Integer>[] getAdjacencyList() {
		return adjacencyList;
	}
	
}
