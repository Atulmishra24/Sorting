public class Main{

    public static void printArr(int arr[]){
    
    for(int i =0 ; i<arr.length;i++){
    
        System.out.print(arr[i] +" ");
    }
    System.out.println();
    }
    
    public static void reverseSelectionSort(int arr[]){
      for(int i = 0 ; i < arr.length;i++ ){
          int maxIdx =i;
          for(int j = i ; j < arr.length;j++){
           if(arr[j]>arr[maxIdx]){
              maxIdx=j;
           }
          } 
          int temp = arr[i];
          arr[i] = arr[maxIdx];
          arr[maxIdx]=temp;
      }
    }
    
        public static void main(String[] args) {
          int arr[] = {9,2,4,1,8,3,6};
          reverseSelectionSort(arr);
          printArr(arr);
       
        }
    
    }