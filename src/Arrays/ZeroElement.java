package Arrays;

public class ZeroElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{1,0,7,5,0};
		
		int Count=0;
		//Counting number of zero
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				Count++;
				
			}
		}
		
		int Temp[]=new int[Count];
		int j=0;
		
		//storing zero in Temp array
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				Temp[j]=arr[i];
				j++;
			}
		}
		
		

		
		
		/*for( j=0;j<Temp.length;j++) {
			System.out.println("Zero's:"+Temp[j]);
			
		}*/
		

	}

}
