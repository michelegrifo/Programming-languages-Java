import java.util.*;
import java.math.*;

public class FibonacciBig{
	private static Map<Integer, BigInteger> table = new HashMap<>();

	public static BigInteger fibonacci(int n){
		if( n == 1 || n == 2)
			return BigInteger.ONE;
		else{
			BigInteger x = BigInteger.ONE, y = BigInteger.ONE, tmp;
			for(int i = 3; i <= n; i++){
				tmp = x;
				x = y;
				y = y.add(tmp); 
			}
			return y;
		}
	}		

	public static void main(String args[]){
		long preTime = System.currentTimeMillis();
		System.out.println("Value of 1,000,000-th number in Fibonacci series:" + fibonacci(1_000_000));
		long postTime = System.currentTimeMillis();
		System.out.println("Time taken to compute (in milliseconds): " + (postTime-preTime));
	}

}