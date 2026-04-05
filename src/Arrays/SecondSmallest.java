package Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {12,4,3,5,2};
		int min=Integer.MAX_VALUE;
		for(int i:array) {
			if(i<min) {min=i;}
		}
		int sec_min=array[0];
		for(int i:array) {
			if(i<sec_min&&i>min) {
				sec_min=i;
			}
		}
		System.out.println("Second minimum value is:"+sec_min);

		

	}

}
