/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int reverse=0;
		while(n!=0)
		{
			int digit=n%10;
			reverse=reverse*10+digit;
			n/=10;
		}
		System.out.println(reverse);
		}
}
