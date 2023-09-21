public class InsertionSortAlpha{
    
    
    public static void insertionSort(int arr[]){

        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
           // Compair and pushing back to cards
            while(prev>= 0 && arr[prev] > curr){
              arr[prev+1] = arr[prev];
              prev--;
            }
            arr[prev+1]=curr;
        }
    }
    
    
    public static void printArr(int arr[]){

        for(int i =0 ; i<arr.length;i++){
    
            System.out.println(arr[i] +" ");
        }
       }
    public static void main(String [] args){
        int arr = {9,2,4,1,8,3};
        printArr(arr);
        insertionSort(arr);    
    }
}