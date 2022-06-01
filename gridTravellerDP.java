/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static Map<String,Long>hm=new HashMap<>();
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(gridTraveller(2,3,hm));
		hm.clear();
		System.out.println(gridTraveller(1,1,hm));
		hm.clear();
		System.out.println(gridTraveller(3,2,hm));
		hm.clear();
		System.out.println(gridTraveller(3,3,hm));
		hm.clear();
		System.out.println(gridTraveller(18,18,hm));
		
	}
	
	public static long gridTraveller(int m,int n,Map<String,Long>hm){
		String key=m+","+n;
		if(hm.containsKey(key)) return hm.get(key);
		if(m==1 && n==1) return 1L;
		if(m==0 || n==0) return 0L;
		
		hm.put(key,Long.sum(gridTraveller(m-1,n,hm),gridTraveller(m,n-1,hm)));
		return hm.get(key);
		
	}
}
