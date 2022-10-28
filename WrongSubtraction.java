package Codeforces;
import java.util.*;
public class WrongSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int a=0;
     for(int i=0;i<m;i++) {
    	 a = n%10;
    	 if(a!=0) {
    		 n-=1;
    	 }
    	 else {
    		 n/=10;
    	 }
     }
     System.out.println(n);
	}

}
