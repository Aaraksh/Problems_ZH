package durga_prg;
public class voteValid extends Exception
	{
		String str;
		public void voteValid(String str)
		{
			this.str=str;
		}
		public String toString()
		{
			return str;
		}
	public static void main(String[] args) 
	{
	  voteValid vv=new voteValid();
	  vv.voteValid("Durga");
	  System.out.println();
	}

}
