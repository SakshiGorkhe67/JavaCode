package Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) {
                min = arr[i];
            }
                if(max<arr[i]){
                    max=arr[i];
                }

        }

        System.out.println("Min:"+min+"|"+"Max:"+max);


    }
}
