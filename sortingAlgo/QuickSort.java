package sortingAlgo;

public class QuickSort {

public static int partition(int arr[],int low,int high) {
    int pivote  = arr[high];
    int i = low-1;
    for(int j = low;j<high;j++){
        if(arr[j]<pivote){
            i++;
            // Swap 
            int tem  = arr[i];
            arr[i]=arr[j];
            arr[j] = tem;
        }
    }
    i++;

    int tem  = arr[i];
    arr[i]=arr[high];
    arr[high] = tem;
    return i; //pivote index
}

    public static void quickSort( int []arr,int low , int high) {
        if(low<high){
            int pivote = partition(arr,low,high);
            quickSort(arr, low, pivote-1);
            quickSort(arr, pivote+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        int n = arr.length;
        quickSort(arr, 0, n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
