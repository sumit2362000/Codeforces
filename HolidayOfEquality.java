package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HolidayOfEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i=0;i<n;i++) {
           p[i]=sc.nextInt();	
        }
        Arrays.sort(p);
        int max = p[n-1];
        int sum = 0;
        for(int k:p) {
        	sum+=max-k;
        }
        System.out.println(sum);
        sc.close();
	}

}
