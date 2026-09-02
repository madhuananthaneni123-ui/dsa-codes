import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int sum=0;
		    while(n>1){
		        sum+=30;
		        n-=2;
		    }
		    if(n==1) sum+=20;
		    System.out.println(sum);
		}

	}
}
