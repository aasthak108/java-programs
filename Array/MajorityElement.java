class MajorityElement
{
static void majorityElement(int a[],int i, int j)
    {
		int maxCount=0;
		int index = 0;
		int n = a.length;
        for(i=0;i<n;i++)
        {
			int count=0;
            for( j=1;j<n;j++)
            {
				if(a[i]==a[j])
				{
					count++;
				}
			}
		if(count>maxCount)
            {
				maxCount = count;
				index = i;
            }
		}
		if(maxCount>n/2)
		{
			System.out.println(" element is "+a[index]);
		}
		else
		{
			System.out.println("not found");
		}
	}

		public static void main(String args[])
		{
			int a[] ={1,1,1,2,2,2,2,2};
			int i=0;
			int j=0;
			majorityElement(a,i,j);
		}
	}
	