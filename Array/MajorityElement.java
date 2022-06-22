 
class MajorityElement
{
static int majorityElement(int a[], int size)
    {
        int x = size/2;
        int count=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size;j++)
            {
				if(a[i]==a[j])
				{
					count++;
				}
			}
            if(count>x)
            {
                System.out.println(""+a[i]);
            }
        }
		return -1;
	}

		public static void main(String args[])
		{
			int a[] = {6,1,15,19,9,13,12,6,7,2,10,4,1,14,11,14,14,13};
			int size = a.length;
			majorityElement(a,size);
		}
	}