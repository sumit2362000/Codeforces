package Codeforces;

import java.util.Scanner;

public class presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=1;i<=n;i++) {
        	a[sc.nextInt()-1]=i;
        }
        	for(int i=0;i<n;i++) {
        		System.out.println(a[i]+" ");
        	}
        }
	}


