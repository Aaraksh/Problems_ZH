package set_papers_prg;

import java.util.Scanner;

public class BobCipher
{

	public static void main(String[] args) 
	{
		int n,i,j,val,c,flag=0,len;
		String s;
		char[] ch;
		boolean[] visit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to move: ");
		n=sc.nextInt();
		
		System.out.println("Enter the String: ");
		sc.nextLine();
		s=sc.nextLine();
		len=s.length();
		System.out.println(len);
		ch=new char[len];
		visit=new boolean[len];
		for(i=0;i<len;i++)
		{
			visit[i]=false;
		}
		ch=s.toCharArray();
		for(i=0;i<len;i++)
		{
			if(!((ch[i]>=65 && ch[i]<=90)  ||  (ch[i]>=97 && ch[i]<=122) && visit[i]==false))
			{
				
				val=i+n;
				
				
				if(val>=len)
				{
					ch[i]='$';
					visit[i]=true;
				}
				else
				{
					if(ch[val]>90 && ch[val]<97)
					{
						ch[val]=(char) (ch[val]-90);
					}
					else if(val>122)
					{
						ch[val]=(char) (ch[val]-122);
					}
					else
						ch[val]=(char) (ch[val]+n);
					
				}
						
			}
		}
		String res=String.copyValueOf(ch);
		System.out.println(res);
	}

}
