package Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[]{1,2,3,4,5};
		
		int n=array.length;
		int arr_max=Integer.MIN_VALUE;

		System.out.println("Maximum:"+arr_max);
		
		//finding the maximun array element 
		for(int i=0;i<n;i++) {
			if(arr_max<array[i]) {
				arr_max=array[i];
			}
		}
		System.out.println("Maximum:"+arr_max);
		
		
		int sec_max=array[0];
		for (int i=0;i<n;i++) {
			if(array[i]>sec_max && array[i]<arr_max) {
				sec_max=array[i];
			}
		}
		System.out.println("Second maximum:"+sec_max);

	}

}
