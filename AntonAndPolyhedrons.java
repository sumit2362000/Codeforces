package Codeforces;

import java.util.Scanner;

public class AntonAndPolyhedrons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),count=0;
       
        for(int i=0;i<n;i++) {
        	String str = sc.next();
        	if(str.charAt(0)=='I') count+=20;
        	if(str.charAt(0)=='T') count+=4;
        	if(str.charAt(0)=='C') count+=6;
        	if(str.charAt(0)=='O') count+=8;
        	if(str.charAt(0)=='D') count+=12;
        
        }
      System.out.println(count);
	}
	

}
