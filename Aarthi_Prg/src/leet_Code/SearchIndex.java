package leet_Code;

public class SearchIndex 
{
	public static int searchInsert(int[] a,int key)
	{
		int mid,l,r,i,res = 0;
		l=0;
		r=a.length-1;
		mid=(l+r)/2;
		if(a[0]>=key)
		{
			return 0;
		}
		else if(a[r]<key)
		{
			return a.length;
		}
		else
		{
			//4System.out.println("Else part"+mid+" "+l+" "+r);
			while(l<r && (mid>=0 && mid<=a.length-1))
			{
				mid=(l+r)/2;
				System.out.println("Mid: "+mid);
				if(a[mid]>=key)
				{
					r=mid-1;
					res=mid;
					if(a[mid]==key)
						break;
				}
				else
				{
					l=mid+1;
					res=mid+1;
				}
			}
		}
			
		return res;
	}
	public static void main(String[] args)
	{
		int[] a= {1,2,4,6,7};
		int n,key=3;
		n=searchInsert(a,key);
		System.out.println(n);
	}

}
