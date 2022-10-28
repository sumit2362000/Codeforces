package Codeforces;
import java.util.*;
public class Tram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int sum = 0;
       int ar[] = new int[t];
       while(t-->0) {
    	   int a = sc.nextInt();
    	   int b = sc.nextInt();
    	   sum-=a;
    	   sum+=b;
    	   ar[t]=sum;
       }
       Arrays.sort(ar);
       System.out.println(ar[ar.length-1]);
       
 }
}
