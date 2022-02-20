package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1, sum=0;
		System.out.print(firstNum);
		for (int i = 1; i <= 8; i++) {
			sum=firstNum+secNum;
			System.out.print(" ");
			System.out.print(sum);
			firstNum=secNum;
			secNum=sum;
		}
	}	

}
