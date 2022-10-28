package Codeforces;

import java.util.*;

public class word {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      String st = sc.next();
      int counter = 0;
      for(int i=0;i<st.length();i++) {
    	  //check if char is uppercase in string
    	  if(Character.isUpperCase(st.charAt(i))) {
    		  counter++;
    	  }
      }
      //to convert UpperCase to lowerCase
      System.out.println(counter>st.length()/2?st.toUpperCase():st.toLowerCase());
	}

}
