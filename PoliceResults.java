package Codeforces;

import java.util.Scanner;

public class PoliceResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(),crime=0;
     int police=0;
     
     for(int i=0;i<n;i++) {
    	 police+= sc.nextInt();
    	if(police<0) {
    		police=0;
    		crime++;
    	 }
     }
     System.out.println(crime);
	}

}
