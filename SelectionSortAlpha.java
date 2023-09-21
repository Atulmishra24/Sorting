public class SelectionSort{




    public static void selectionSortAlgo(int [] arr){
        for(int i = 0; i < arr.length-1 ; i++){
             int minIdx = i ;  
            for(int j= i+1 ; j < arr.length ; j++){
                 if(arr[j] < arr[minIdx]){
                    minIdx=j;
                 }
              } 
            int temp = arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;       
        }
    }


    public static void printArr(int arr[]){

        for(int i =0 ; i<arr.length;i++){
    
            System.out.println(arr[i] +" ");
        }
       }
    public static void main(String [] args){
         int arr = {9,2,4,1,8,3};
         selectionSortAlgo(arr);
         printArr(arr);


    }
}