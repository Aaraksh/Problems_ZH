package leet_Code;


public class ValidPalin 
{

	public static void main(String[] args) 
	{
		String s="A man, a plan, a canal: Panama";
		int i,j,l,n;
        String str="",res;
        n=s.length();
        s=s.toLowerCase();
        char[] a=s.toCharArray();
        for(i=0;i<n;i++)
        {
            if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122) || (a[i]>=48 && a[i]<=57))
            {
                str=str+Character.toString(a[i]);
            }
        }    
        res=str;
        StringBuilder sb=new StringBuilder(str);
        str=sb.reverse().toString();
        res=res.trim();
        str=str.trim();
        if(str.equals(res))
        {
        	System.out.println(true);
        	//return true;
        }
        else 
        {
        	System.out.println(false);
        	//return false;
        }
        
		

	}

}
