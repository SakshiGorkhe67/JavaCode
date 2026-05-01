package Arrays;

import java.util.Arrays;

public class HalfAcDec {
    public static void main(String[] args) {
        int arr[] = {4, 1, 2, 3, 4, 5};
        int n = arr.length;
     Arrays.sort(arr);

     int start=n/2;
     int end=n-1;

     while(start!=end){
         int temp = arr[start]

                 ;
         arr[start] = arr[end];
         arr[end] = temp;
         start++;
         end--;
     }
        System.out.println(Arrays.toString(arr));
    }
}
