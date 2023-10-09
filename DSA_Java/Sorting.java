import java.util.*;
class Sorting {
    public static void main(String[] args){ 
        int[] arr = {7,8,3,1,2};

        //--------------- bubble sort -------------------
        // for(int i=0;i<(arr.length-1);i++){
        //     for(int j=0;j<(arr.length-i-1);j++){
        //         if(arr[j] > arr[j+1]){
        //             // swap values
        //             int tempVal = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = tempVal;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));
        
        //time complexity = O(n^2)
        //---------------- Selection sort ---------------------
        // for(int i=0;i<arr.length-1;i++){
        //     int smallVal = i;
        //    for(int j=i+1;j<arr.length;j++){
        //     if(arr[smallVal] > arr[j]){
        //         smallVal = j;
        //     }
        //    }
        //    int temp = arr[i];
        //    arr[i] = arr[smallVal];
        //    arr[smallVal] = temp;
        // }
        // System.out.println(Arrays.toString(arr));

        //----------- Insertion sorting ----------------
        // for(int i=1;i<arr.length;i++){
        //     int current = arr[i];
        //     int j = i-1;
        //     while(j>=0 && current < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = current;
        // }
        // System.out.println(Arrays.toString(arr));
    }
}