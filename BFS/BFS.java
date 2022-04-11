import java.util.*;

public class BFS {
	
	void BFS(int s,int noOfVertices, LinkedList<Integer> adjacencyList[])
    {
		
		//Mark all the vertices as not visited(By default set as false)
		         
		boolean visited[] = new boolean[noOfVertices];
 
        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
 
        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);
 
        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
 
			/*
			 * Get all adjacent vertices of the dequeued vertex s If a adjacent has not been
			 * visited, then mark it visited and enqueue it
			 */
            Iterator<Integer> i = adjacencyList[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int noOfVertices,s;
		 LinkedList<Integer> adjLst[];
		 Graph_bfs gbfs = new Graph_bfs(7);
		 BFS bfs=new BFS();
		 
		  
		 gbfs.addEdge(0, 1);
		 gbfs.addEdge(0, 2);
		 gbfs.addEdge(0, 3);
		 gbfs.addEdge(3, 4);
		 gbfs.addEdge(3, 5);
		 gbfs.addEdge(2, 6);
	        
	        
	 
	        System.out.println("Following is BFS Traversal "+
	                           "(starting from vertex 0)");
	        
	        s=0;
	        noOfVertices=gbfs.getnoOfVertices();
	        adjLst=gbfs.getAdjacencyList();
	 
	        bfs.BFS(s,noOfVertices,adjLst);

	}

}
