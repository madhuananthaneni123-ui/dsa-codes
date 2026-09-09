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
		    int[] a=new int[n];
		    HashMap<Integer,Integer> h1=new HashMap<>();
		     int max=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		         h1.put(a[i],h1.getOrDefault(a[i],0)+1);
		        max=Math.max(max,h1.get(a[i]));
		    }
		    
		    System.out.println((max+1)/2);
		    
		}

	}
}
