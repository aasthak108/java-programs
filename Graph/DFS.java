import java.io.*;
class DFS
{
static class GraphDFS
{
	int v;
	int e;
	static int[][] adj;
	GraphDFS(int v,int e)
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
	void dfs(int s,boolean[] visited)
	{
		System.out.println(""+s);
		visited[s] = true;
		for(int i=0;i<4;i++)
		{
			if(adj[s][i] ==1 &&(!visited[i]))
			{
				dfs(i,visited);
			}
		}
	}
}
	public static void main(String args[])
	{
		int v=4;
		int e=3;
		GraphDFS g = new GraphDFS(v,e);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,3);
		boolean[] visited = new boolean[v];
		g.dfs(0,visited);
	}
}