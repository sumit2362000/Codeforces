package Codeforces;

import java.util.Scanner;

public class phoenixAndBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      for(int i=0;i<n;i++)
      {
    	 int a = sc.nextInt();
    	 System.out.println((int)Math.pow(2, a/2+1)-2);
    	  
      }
	}
}
