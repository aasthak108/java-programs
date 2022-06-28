class MatrixSearch
{
	public static int matrixSearch(int mat[][],int key)
	{
		int n= 2;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j] == key)
				{
					return 1;
				}
			}
		}
		return 0;
	}
	public static void main(String args[])
	{
		int mat[][] = {{1,2,3},
						{4,5,6}};
		matrixSearch(mat,6);
	}
}
		