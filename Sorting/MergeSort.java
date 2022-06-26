class MergeSort
{
	public static void merge(int arr[],int l,int m,int u)
	{
		int j,k,i;
		int n1=m-l+1;
		int n2 =u-m;
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		for(i=0;i<n1;i++)
		{
			leftArray[i] = arr[l+i];
		}
		for( j=0;j<n2;j++)
		{
			
			rightArray[j] = arr[m+1+j];
		}
		k=l;
		i=0;
		j=0;
		while(i<n1 && j<n2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
	void sort(int arr[],int l,int u)
	{
		if(l<u)
		{
			int m = (l+u)/2;
			sort(arr,l,m);
			sort(arr,m+1,u);
			merge(arr,l,m,u);
		}
	}
	static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(""+ arr[i]);
		}
	}
	public static void main(String args[])
	{
		int arr[] = {1,5,8,3,5,9,2};
		MergeSort s = new MergeSort();
		s.sort(arr,0,arr.length-1);
		printArray(arr);
	}
}
			
			
		