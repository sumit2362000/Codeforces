package Codeforces;

import java.util.*;

public class StonesoNbiGtABLE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), count = 0;
		String s = sc.next();
		for (int i = 0; i < n - 1; i++) {
			if (s.charAt(i) == s.charAt(i+1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}