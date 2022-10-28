package Codeforces;

import java.util.*;
public class BeautifulMatrix{
	public static void main(String[] args){
		Scanner r=new Scanner(System.in);
		int i,j,k,x=0;
		for(i=1;i<6;i++){
			for(j=1;j<6;j++){
				k=r.nextInt();
				if(k==1)
					x=(int)(Math.abs(i-3)+Math.abs(j-3));
 
			}
		}
		System.out.println(""+x);
	}
}