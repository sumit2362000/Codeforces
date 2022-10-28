package Codeforces;

import java.util.Scanner;

public class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      String word = sc.next();
      String reversed = new StringBuilder(sc.next()).reverse().toString();
      System.out.println(word.equals(reversed)?"YES":"NO");
	}

}
