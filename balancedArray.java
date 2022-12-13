package Codeforces;

import java.util.Scanner;

public class balancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
        	int n = sc.nextInt();
        	if(n%4 == 0) {
        	System.out.println("YES");
           int c = 0;
           for(int j=1;j<=n/2;j++) {
        	   System.out.println(j*2+" ");
           }
           for(int j=0;j<n/2-1;j++) {
        	   System.out.println(j*2+1+" ");
        	   c = (j+1)*2+1;
           }
           System.out.println(c+n/2+" ");
        }else {
        	System.out.println("NO");
        }
	}

	}
}
