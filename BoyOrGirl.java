package Codeforces;
import java.util.Scanner;
 
public class BoyOrGirl {
 
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next().chars().distinct().count()%2==0? "CHAT WITH HER!":"IGNORE HIM!");
 
	}
 
}