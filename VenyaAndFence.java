package Codeforces;

import java.util.*;

public class VenyaAndFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
	       int nsize = sc.nextInt(), h=sc.nextInt(), b=nsize;
	       int[] n = new int[nsize];
	       for(int i=0; i<nsize; i++) n[i]=sc.nextInt();
	       for(int i=0; i<nsize; i++) if(n[i]>h) b++;
	       System.out.println(b);
        }
	}


