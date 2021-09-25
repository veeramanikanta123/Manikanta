package utility;
public class Calculator1
{
	public static final double PI = 3.14;
	public static int power(int x,int n)
	{
		int res = 1;
		for(;n>0;n--)
			res = res * x;
		return res;
	public static int sqr(int x)
	{
		return x*x;
	}
	public static int sum(int...x)
	{
		int s = 0;
		for(int i : x)
 			s=s+i;
		return s;
	}
}