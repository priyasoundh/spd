import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Dec_bin_len
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a=0,b=0,c=1,d=0;
		while(n>0)
		{
			a=n%2;
			n=n/2;
			b=n;
			d=(c*a)+d;
			c=c*10;
		}
		d=(c*b)+d;
		int count=0;
		if(d==0)
		{
			System.out.println("1");
		}
		else
		{
			while(d>0)
			{
				d=d/10;
				count++;
			}
			System.out.println(count);
		}
	}
}
