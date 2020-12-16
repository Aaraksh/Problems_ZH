package generic_prg;

class TwoD
{
	int x,y;
	TwoD(int a,int b)
	{
		x=a;
		y=b;
	}
}
class ThreeD extends TwoD
{
	int z;
	ThreeD(int a,int b,int c)
	{
		super(a,b);
		z=c;
	}
}
class FourD extends ThreeD
{
	int s;
	FourD(int a,int b,int c,int d)
	{
		super(a,b,c);
		s=d;
	}
}

class Coords<T extends TwoD>
{
	T[] cor;
	Coords(T[] o)
	{
		cor=o;
	}
}

public class BoundPrg 
{
	static void showXY(Coords<?> c)
	{
		System.out.println("TwoD structure: ");
		for(int i=0;i<c.cor.length;i++)
		{
			System.out.println(c.cor[i].x +"  "+c.cor[i].y);
		}
	}
	static void showXYZ(Coords<? extends ThreeD> c)
	{
		System.out.println("ThreeD structure: ");
		for(int i=0;i<c.cor.length;i++)
		{
			System.out.println(c.cor[i].x +"  "+c.cor[i].y+"  "+c.cor[i].z);
		}
	}
	static void showAll(Coords<? extends FourD> c)
	{
		System.out.println("FourD structure: ");
		for(int i=0;i<c.cor.length;i++)
		{
			System.out.println(c.cor[i].x +"  "+c.cor[i].y+"  "+c.cor[i].z+"  "+c.cor[i].s);
		}
	}

	public static void main(String[] args) 
	{
		TwoD[] td= {new TwoD(0,0), new TwoD(1,1), new TwoD(2,2), new TwoD(3,3) };
		Coords<TwoD> tt=new Coords<TwoD>(td);
		showXY(tt);
		
		FourD[] ff= {new FourD(1,2,3,4), new FourD(5,7,6,9), new FourD(-2,5,6,8), new FourD(9,3,-2,1) };
		Coords<FourD> cf=new Coords<FourD>(ff);
		showXY(cf);
		showXYZ(cf);
		showAll(cf);

	}

}
