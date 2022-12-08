package Codeforces;

import java.util.Scanner;

public class ChoosingTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++) {
        	int temp = sc.nextInt();
        	if(5-temp>=k) {
        		count++;
        	}
        	
        }
        System.out.println(count/3);
}

}
