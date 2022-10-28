package Codeforces;

import java.util.*;

public class BeautifulYea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          int s = sc.nextInt();
          for(;;) {
          s++;
          int a = (s/1000)%10;
          int b = (s/100)%10;
          int c = (s/10)%10;
          int d = s%10;
          if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d) {
        	  break;
          }
          
	}
    System.out.println(s);
}
}