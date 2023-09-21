public class reverseCountingSort{
    public static void countSort(int [] arr){
        // Find Largest Number in the Array
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++) {
            largest = Math.max(largest, arr[i]);
        }
    
        // Find Counting array With The array
        int count[] = new int[largest + 1];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
    
        // Reverse Sorting of Array
        int j = 0;
        for(int i = count.length - 1; i >= 0; i--) {
            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;  
            }
        }
    } 
    
   
    public static void main(String arr[] ){
          int arr[] = {2,2,4,5,6,2,5,7,34,7};
          countSort(arr);
    }
}