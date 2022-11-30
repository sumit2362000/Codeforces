package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int[] a = new int[4];
    for(int i=0;i<4;i++) 
    	a[i] = sc.nextInt();
    	Arrays.sort(a);
    	int p = a[a.length-1];
        System.out.println((p-a[2])+" "+(p-a[1])+" "+(p-a[0]));
    }
    
      
}

