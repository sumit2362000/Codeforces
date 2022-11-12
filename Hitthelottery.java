package Codeforces;

import java.util.Scanner;

public class Hitthelottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      int ans = 0;
      int arr[] = {100,20,10,5,1};
      for(Integer x:arr) {
    	  ans+=n/x;
    	  n=n%x;
      }
      System.out.println(ans);
	}

}
