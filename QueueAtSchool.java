package Codeforces;

import java.util.Scanner;

public class QueueAtSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int t = sc.nextInt();
       String a = sc.next();
      while(t-->0) {
    	  a = a.replaceAll("BG", "GB");
    
      }
      System.out.println(a);
	}

}
