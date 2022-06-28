class BooleanMatrix
{
	public int[][] booleanMatrix(int mat[][],int n,int m)
	{
		int row[] = new int[n];
		int col[] = new int[m];
		for(int i=0;i<n;i++)
		{
			row[i] = 0;
		}
		for(int j=0;j<m;j++)
		{
			col[j]=0;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(mat[i][j] == 1)
				{
					row[i]=1;
					col[j]=1;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(row[i] ==1 || col[j] ==1)
				{
					mat[i][j] = 1;
				}
			}
		}
		return mat;
	}
	public static void main(String args[])
	{
		int mat[][]= {{1,0,0},
					  {1,0,0},
					  {0,0,0}};
		int n=3;
		int m = 3;
		int matrix[][] = new BooleanMatrix().booleanMatrix(mat,3,3);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}
			
		
		