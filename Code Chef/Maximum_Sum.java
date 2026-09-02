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
		    int k=sc.nextInt();
		    int[] arr=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    int st=0,j=n-1;
		    int win=n-k;
		    int sum=0;
		    for(int i=0;i<win;i++){
		        sum+=arr[i];
		    }
		    int max=sum;
		    for(int i=win;i<n;i++){
		        sum-=arr[st];
		        sum+=arr[i];
		        st++;
		        max=Math.max(sum,max);
		    }
		    System.out.println(max);
		}

	}
}
