package Codeforces;

import java.util.Scanner;

public class InsearchOfAnEasyProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int person=0;
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            if(x==1)
            person++;
        }
        if(person>0)
        System.out.println("HARD");
        else
        System.out.println("EASY");
	}

}
