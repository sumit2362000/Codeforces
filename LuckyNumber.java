package Codeforces;

import java.util.*;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.next().replaceAll("[^47]", "").length();
		if(n == 7 || n == 4) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
