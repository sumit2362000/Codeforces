package Codeforces;

import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int[] home = new int[n];
        int[] away = new int[n];
        for(int i=0;i<n;i++) {
        	home[i]=sc.nextInt();
        	away[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(home[i]==away[j])
        		{
        			ans++;
        		}
        	}
        }
        System.out.println(ans);
	}

}
