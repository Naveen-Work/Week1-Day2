package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int a=123;
		int sum=0;
		//System.out.println(a%10);
		
		  while(a%10!=0) {
		  sum=sum+a%10;
		  a=a/10;
		  }
		  System.out.println("Final Sum: "+sum);

	}

}
