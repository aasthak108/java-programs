class MatrixRotation
{
	public int[][] matRotation(int mat[][],int n)
	{
		int i,j;
		int temp[][] = new int[4][4];
		for(i=0;i<n;i++)
		{
			for( j=0;j<n;j++)
			{
				temp[i][j] = mat[i][j];
			}
		}
		for(i=0;i<n;i++)
			
		{
			for(j=0;j<n;j++)
			{
				mat[i][j] = temp[n-i-1][j];
			}
		}
		return mat;
	}
	public static void main(String args[])	
	{
		int i,j;
		int n =4;
		int mat[][]={ {1,2,3,4},
					{5,6,7,8},
		            {9,10,11,12},
					{13,14,15,16}};
		int matrix_rotation[][]= new MatrixRotation().matRotation(mat,n);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix_rotation[i][j] + " ");
				System.out.print("\n");
			}
		}
	}
}
	