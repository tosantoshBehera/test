package santosh.test.streamcode;

import java.util.Scanner;

public class PalindromeTest {

	public static boolean palindromeDescendant(int num) {
		boolean bn=false;
		while (num > 9) {
			if (isSymmetrical(num)) {
				bn=true;
				break;
			}
			num = getSumofdigits(num);
		}
		return bn;
	}
	public static boolean isSymmetrical(int num) {
		int rev=0, n=num;
		if(n<0)
			n=n*-1;
		while(n!=0) {
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		return(rev==num);
	}
	public static int getSumofdigits(int num) {
		String iString = Integer.toString(num);
		StringBuilder sb= new StringBuilder();
		
		for (int i=0;i<iString.length()-1;i+=2) {
			int i1=Integer.parseInt(Character.toString(iString.charAt(i)));
			int i2=Integer.parseInt(Character.toString(iString.charAt(i+1)));
			int sum =i1+i2;
			sb.append(Integer.toString(sum));
		}
		return Integer.parseInt(sb.toString());
	}
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in); // Create a Scanner object
	System.out.println("number");
	int number = input.nextInt();
	boolean result=palindromeDescendant(number);
	System.out.println(result);
}
}