/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static int[] arr={3,1,2};
	static List<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		System.out.println(Arrays.toString(arr));
        System.out.println("Hello, World!");
        int l=0,r=arr.length-1;
    	m1(0,list);
    	System.out.println(Arrays.toString(arr));
    }
    //private static int count=5;
    public static void m1(Integer indx,List<Integer> list){
        if(indx>=arr.length){
        	System.out.println(list.toString());
        	return;
        }
        list.add(arr[indx]);
        m1(indx+1,list);
        list.remove(Integer.valueOf(arr[indx]));
        m1(indx+1,list);
    }
}
