package String;

/**
 * longestIncreasingSubarray
 */
public class longestIncreasingSubarray {

    public static void longestIncreasingSubarra(int n,int[] arr){
        int max = 1, len = 1;
        for(int i =1;i<n;i++){
            if(arr[i]>arr[i-1]){
                len++;
            }
            else{
                if(max<len){
                   max=len;
                }
                   len=1;
            }    
        }
         if(max<len){
        System.out.println(len);
                }else{
        System.out.println(max);
                }
      }
      public static void main(String[] args) {
        int arr[]=new int[]{1,3,6,5,2,4,6,7,8};
        longestIncreasingSubarra(arr.length, arr);
      }
    
}