package Codeforces;

import java.util.Scanner;

public class bitplusplus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        String a = "++X";
        String b = "--X";
        String[] str = new String[num];
        for(int i=0;i<num;i++)
        {
        	String y = sc.next();
        	str[i]=y;
        }
        for(int i=0;i<num;i++)
        {
        	if(str[i].equals(a)||str[i].equals(b)) {
        		x++;
        	}        		
            else
        		x--;
        	}
        	System.out.println(x);
        }
	}


