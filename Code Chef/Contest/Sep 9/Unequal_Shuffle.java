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
		    sc.nextLine();
		    String a=sc.nextLine();
		    String b=sc.nextLine();
		    int cnt1=0,cnt2=0;
		    int c20=0,c21=0;
		    for(int i=0;i<n;i++){
		        char c1=a.charAt(i);
		        char c2=b.charAt(i);
		        if(c1=='a') cnt1++;
		        else cnt2++;
		        if(c2=='a') c20++;
		        else c21++;
		    }
		    if(cnt1==c21 && cnt2==c20) System.out.println("YES");
		    else System.out.println("NO");
		    
	
}
	}
}
