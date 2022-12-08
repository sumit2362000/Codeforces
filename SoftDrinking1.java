package Codeforces;

import java.util.Scanner;

public class SoftDrinking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();int k =sc.nextInt();int l=sc.nextInt();int c=sc.nextInt();int d=sc.nextInt();int p=sc.nextInt();int nl=sc.nextInt();int np=sc.nextInt();
       System.out.println(Math.min(Math.min(k*l/nl, c*d),p/np)/n);
	}

}
