import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int f=sc.nextInt();
		    if(a*12<(b*12+f)) System.out.println(a*12);
		    else System.out.println(b*12+f);

	}
}
