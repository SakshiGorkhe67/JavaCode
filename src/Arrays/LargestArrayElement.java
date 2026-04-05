package Arrays;

public class LargestArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[]{10,5,15,3,7};
		int max=Integer.MIN_VALUE;
		for(int i:array) {
          if(i>max) {
				max=i;
		  }
		}
		System.out.println("Maximum value is:"+max);

	}

}
