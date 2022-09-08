import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class BFS
{
static class Graph
{
	int v;
	int e;
	int adj[][];
	Graph(int v,int e)
	{
		this.v = v;
		this.e = e;
		adj = new int[v][v];
	}
	void addEdge(int s,int d)
	{
		adj[s][d]=1;
		adj[d][s]=1;
	}
	void bfs(int s)
	{
		boolean[] visited = new boolean[v];
		Arrays.fill(visited,false);
		List<Integer> q = new ArrayList<>();
		q.add(s);
		visited[s]= true;
		int vis;
		while(!q.isEmpty())
		{
			vis = q.get(0);
			System.out.println(vis + " ");
			q.remove(q.get(0));
			for(int i =0;i<v;i++)
			{
				if(adj[vis][i] ==1 &&(!visited[i]))
				{
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
	public static void main(String args[])
	{
		int v=4,e =3;
		Graph g = new Graph(v,e);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		g.bfs(0);
	}
}
		
		
			