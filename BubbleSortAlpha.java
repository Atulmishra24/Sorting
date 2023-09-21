public class BubbleSortAlpha{

   public static void bubbleSort(int arr[]){
          
        int n = arr.length;
        for(int turn =0 ; turn< n-1 ; turn++){
            int swap =0;
            for(int j =0 ; j<n-1-turn ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }



   }


   public static void printArr(int arr[]){

    for(int i =0 ; i<arr.length;i++){

        System.out.println(arr[i] +" ");
    }
   }

    public static void main(String [] args){
     int arr[] = {9,2,4,1,8,3,6};

     bubbleSort(arr);
     printArr(arr);


    }
}