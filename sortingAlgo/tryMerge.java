package sortingAlgo;

import java.util.Arrays;

public class tryMerge {
public static void merger(int arr[],int si,int mid,int ei) {
    int newArray[] = new int [ei-si+1];
    int index1 = si;
    int index2 = mid+1;
    int x =0;
    while(index1<=mid && index2<=ei){
        if(arr[index1]<=arr[index2]){
            newArray[x++] = arr[index1++];
        }else{
            newArray[x++] = arr[index2++];
        }
    }

    while(index1<=mid){
        newArray[x++] = arr[index1++];
    }
    while(index2<=ei){
        newArray[x++] = arr[index2++];
    }

    for(int i = 0, j =si;i<newArray.length;i++,j++){
        arr[j] = newArray[i];
    }

}
    public static void devide(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
       int mid = si+(ei-si)/2;
       devide(arr, si, mid); 
       devide(arr, mid+1, ei); 
       merger(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int arr [] = new int[]{5,4,3,2,1};
        int n = arr.length -1;
        int start = 0 ;
        int high = n;
        devide(arr, 0, high);
        System.out.print(Arrays.toString(arr));
    }
}
