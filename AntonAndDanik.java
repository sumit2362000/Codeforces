package Codeforces;

import java.util.*;

public class AntonAndDanik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String s = sc.next();
    int A=0;int D=0;
    for(int i=0;i<s.length();i++) {
    	if(s.charAt(i)=='A') {
    		A++;
    	}
    	else {
    		D++;
    	}
    }
    System.out.println(A>D?"Anton":A==D?"Friendship":"Danik");
	}

}
