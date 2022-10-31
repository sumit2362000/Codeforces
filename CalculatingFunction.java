package Codeforces;

import java.util.*;

public class CalculatingFunction {
	public long CalculatingFunction() {
		Scanner sc =new Scanner(System.in);
		long n = sc.nextInt();
		long fn = 0;
		if(n%2==0) return fn/2;
		else fn=(-1)*(n/2+1);
		return fn;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
       CalculatingFunction calc=new CalculatingFunction();
       System.out.println(calc.CalculatingFunction());
       

}
}
/*public static void main(String args[]) {
	long n = new Scanner (System.in).nextLong();
	System.out.println(n%2==0?n/2:-(n/2)-1);
}*/



/*public static void main(String[] args) {   
Scanner scanner = new Scanner(System.in);
      long n = scanner.nextLong();
        System.out.println(functionEvaluationSolver(n));
    }
 
    public static long functionEvaluationSolver(long n) {
        if (n % 2 == 0) {
            return n / 2;
        } else {
            return (-1) + -1 * ((n - 1) / 2);
        }
    }
}*/
/*public static void main(String[] args)
{
    Scanner hiu = new Scanner(System.in);
    Long n=hiu.nextLong();
    if(n%2==1)
        System.out.print(-n+n/2);
    else
        System.out.println(n/2);
}*/
//public static Long Fx(Long n)
//{
//    if(n==1) return -n;
//    if(n%2==0)
//        return n+Fx(--n);
//    else return -n+Fx(--n);
//}
