package Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {10,3,45,6,78,2};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:array) {
			if(i>max) {max=i;}
			else if(i<min) {min=i;}
		}
		System.out.println("Maximum value is:"+max);
		System.out.println("Minimum value is:"+min);

	}

}
