public class ReverseBubbleSortAlpha{
  
    public static void printArr(int arr[]){
    
        for(int i =0 ; i<arr.length;i++){
        
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        }
        

    public static void ReverseBubbleSort(int[] arr){

        boolean swapped = true;
        for(int i =0 ; i< arr.length ; i++){
            for(int j = i ; j < arr.length ; j++ ){
              if(arr[i]< arr[j]){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                swapped=false;
              }

            }
            if(swapped){
               break;
            }

        }

    }
    public static void main(String []args){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        ReverseBubbleSort(arr);
        printArr(arr);
    }
}