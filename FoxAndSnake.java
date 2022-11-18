package Codeforces;

import java.util.Scanner;

public class FoxAndSnake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=m;j++) {
        		if((i%4==2&&j!=m)||(i%4==0&&j!=1))
        			System.out.println(".");
        		else {
					System.out.println("#");
				}
        		System.out.println();
        	}
        }
	}

}
