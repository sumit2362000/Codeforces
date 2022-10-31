package Codeforces;

import java.util.Scanner;

public class Magnets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int a,b=0,c=0;
      for(int i=0;i<n;i++) {
    	 a=sc.nextInt();
    	 if(a!=b) c++;
    	 b=a;
      }
      System.out.println(c);
	}

}
