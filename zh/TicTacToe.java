package zh;


import java.util.Scanner;

public class TicTacToe
{

	public static void main(String[] args) 
	{
		String s;
		char[] a;
		char ch;
		char[][] tt=new char[3][3];
		int i,j,k=0,m,n,len,flag=1,x=0,y=0,f=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		s=sc.next();
		len=s.length();
		System.out.println("Enter the character to place: ");
		ch=sc.next().charAt(0);
		a=s.toCharArray();
		if(len==9)
		{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[k]!='X' && a[k]!='O' && a[k]!='-')
				{
					flag=0;
				}
				tt[i][j]=a[k++];	
			}
		}
		}
		else
			flag=0;
		j=0;
		if(flag==1)
		{
			for(m=0;m<3;m++)
			{
				for(n=0;n<3;n++)
				{
					if(tt[m][n]=='-')
					{
						tt[m][n]=ch;
						x=m;y=n;
						for(i=0;i<3;i++)
						{
							j=0;
							if((tt[i][j++]==tt[i][j]) && (tt[i][j++]==tt[i][j]))
							{
								System.out.println(x+","+y);	
								f=1;
							}
							
						}
						i=0;
						for(j=0;j<3;j++)
						{
							i=0;
							if((tt[j][i++]==tt[j][i]) && (tt[j][i++]==tt[j][i]))
							{
								System.out.println(x+","+y);	
								f=1;
							}
							
						}
						
						i=0;j=0;
						if((tt[i++][j++]==tt[i][j])  && (tt[i++][j++]==tt[i][j]) )
						{
							System.out.println(x+","+y);
							f=1;
						}
						
						i=0;j=2;
						if(tt[i++][j--]==tt[i][j] && tt[i++][j--]==tt[i][j])
						{
							System.out.println(x+","+y);
							f=1;
						}

						
						
						tt[x][y]='-';
					}
				}
				
			}
			if(f==0)
			{
				System.out.println("No Possible Position");
			}
		}
		else
			System.out.println("Error");
	}

}
