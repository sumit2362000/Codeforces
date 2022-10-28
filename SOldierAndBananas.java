package Codeforces;

import java.util.*;

public class SOldierAndBananas {
	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		int k = io.nextInt();
		int n = io.nextInt();
		int w = io.nextInt();
		System.out.println(Math.max((w*(w+1)/2)*k - n, 0));
	}
}
