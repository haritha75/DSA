/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int j=0;j<n;j++)
		      a[j]=sc.nextInt();
		
		      
		    HashMap<Integer,Integer> map = new HashMap<>();
		    for(int h=0;h<n;h++) {
		        if(!map.containsKey(a[h]))
		          map.put(a[i],1);
		        else {
		            int pre = map.get(a[i]);
		            map.put(a[i],pre+1);
		        }
		          
		    }
		
		    boolean flag = true;
		    for(Integer a1:map.values()) {
		        if(a1%2!=0) {
		            flag = false;
		          
		        }
	}
		    
		    if(flag)
		      System.out.println("YES");
		    else
		      System.out.println("NO");
	
	}
		
	}
}
