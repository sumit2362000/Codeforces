package Codeforces;

import java.util.Scanner;

public class BuyaShovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int k = sc.nextInt();
     int r = sc.nextInt();
     int a = 1;
    	while((k*a)%10!=0 &&(k*a)%10!=r) {
    		a=a+1;
    	}
    	System.out.println(a);
     
	}

}
