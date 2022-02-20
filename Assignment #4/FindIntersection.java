package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {

		//Declare An array for {3,2,11,4,6,7};
		int[] ary = {3,2,11,4,6,7};
		//Declare another array for {1,2,8,4,9,7};
		int[] ary1 = {1,2,8,4,9,7};
		int[] ary2=new int[ary.length];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary1.length; j++) {
				if(ary[i]==ary1[j]) {
					ary2[i]=ary1[i];
					System.out.println(ary2[j]);
				}
			}
			
		}
		
		
	}

}
