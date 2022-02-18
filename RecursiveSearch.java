class RecursiveSearch
{
	public int recSearch(int arr[],int l,int r, int x)
	{
		if(r<l)
		return -1;
		if(arr[l]==x)
		return 1;
		if(arr[r]==x)
		return 1;
		return recSearch(arr,l+1,r-1,x);
	}
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int l=0;
		int r= arr.length - 1;
		int x=3;
		int searchednumber = new RecursiveSearch().recSearch(arr,l,r,x);
		System.out.println(searchednumber + "");
	}
}