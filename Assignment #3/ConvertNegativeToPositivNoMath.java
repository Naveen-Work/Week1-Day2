package week1.day2;

public class ConvertNegativeToPositivNo {

	public static void main(String[] args) {
		int number = -40;
		int posno=0;
		if(number<0) {
			posno=math.abs(number);
			System.out.println("The number "+number+" is converted to "+posno);
		}else {
			System.out.println("The number "+number+" is Positive number");
		}

	}

}
