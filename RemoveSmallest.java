package Codeforces;

import java.util.*;

public class RemoveSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      
      int t = sc.nextInt();
      while(t-->0) {
    	  int n=sc.nextInt();
    	  boolean test = true;
    	  int[] a = new int[n];
    	  for(int i=0;i<n;i++) {
    		  a[i]=sc.nextInt();
    	  }
    	  Arrays.sort(a);
    	  for(int i=0;i<n-1;i++) {
        	  if(a[i+1]-a[i]>1) {
        		  test = false;
        		  break;
        	  }
    	  }
        	  System.out.println(test?"YES":"NO");
      }
      sc.close();
    	  
      }
	}


