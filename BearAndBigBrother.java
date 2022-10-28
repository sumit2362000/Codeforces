package Codeforces;

import java.util.*;
public class BearAndBigBrother{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int n=sc.nextInt();
int count=0;
while(n>=k){
k*=3;
n*=2;
count++;
}
System.out.println(count);
}
}