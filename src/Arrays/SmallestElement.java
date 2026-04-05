package Arrays;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[] {10,5,15,7,3,5};
		int min=Integer.MAX_VALUE;
		for(int i:array) {
			if(i<min) {min=i;}
		}
		System.out.println("Minimum value is:"+min);

	}

}
