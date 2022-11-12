package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class AmusingJoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str = "";
        str3=str1+str2;
        char[] a = str.toCharArray();
        char[] b = str3.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String S1 = new String(a);
        String S2 =  new String(b);
        System.out.println(S1.equals(S2)?"YES":"NO");
	}

}
