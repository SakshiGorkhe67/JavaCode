package Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={4,3,1,5,2,45,67};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){

            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
