 
class MajorityElement
{
static int majorityElement(int a[], int size,int i, int j)
    {
        int c=0;
		int count;
        for(i=0;i<size;i++)
        {
			count=0;
            for( j=1;j<size;j++)
            {
				if(a[i]==a[j])
				{
					count++;
				}
			}
		if(count>c)
            {
				count = c;
				int index = i;
            }
		}
		if(count>size/2)
		{
			 System.out.println(""+a[i]);
		}
		return -1;
	}

		public static void main(String args[])
		{
			int a[] ={6,1,15,19,9,13,12,6,7,2,10,4,1,14,11,14,14,13};
			int size = a.length;
			int i=0;
			int j=0;
			majorityElement(a,size,i,j);
		}
	}