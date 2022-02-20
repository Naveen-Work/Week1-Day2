package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		int num1=13,num2=15,num3=17;
		double num4=15,num5=5;
		float num6=15,num7=2;
		Calculator Cal=new Calculator();
		System.out.println("Addition of "+num1+"+"+num2+"+"+num3+" is "+Cal.add(num1,num2,num3));
		System.out.println("Subtraction : "+num1+"-"+num2+" is "+Cal.sub(num1,num2));
		System.out.println("Multiplication : "+num4+"*"+num5+" is "+Cal.mul(num4, num5));
		System.out.println("Division : "+num6+"/"+num7+" is "+Cal.divide(num6, num7));

	}

}
