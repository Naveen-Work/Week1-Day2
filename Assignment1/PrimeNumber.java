package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		
		boolean flag=true;
		
		for (int i=2; i < input/2; i++) {
			if(input%i==0) {
				flag=false;
				break;
			}
		}
			if(flag==true) {
				System.out.println(input+" is a Prime Number");
			}else
			{
				System.out.println(input+" is a Not Prime Number");
			}

	}

}
