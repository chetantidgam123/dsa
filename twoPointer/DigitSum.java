/**
 * DigitSum
 */
// import java.util.*;
public class DigitSum {
    public static void main(String[]args){
        // Scanner sc = new Scanner(System.in);
        // int tc =  sc.nextInt();
        // for(int i =0;i<tc;i++){
        // int n =  sc.nextInt();
        // int[]arr=new int[n];
        // for(int j=0;j<n;j++){
        //     arr[j]=sc.nextInt();
        // }
        int[]arr=new int[]{11,21,51,61,81,9};
        int[]arr1=new int[arr.length];
        for(int k=0;k<arr.length;k++){
            int number = arr[k];
            int sum =0;
            if(number>9){
           while(number>0){
               sum =sum+number%10;
              number = number/10;
           }
           arr1[k]=sum;
            }else{
                arr1[k]=number;
            }
        System.out.print(arr1[k]+" ");
        }
        System.out.println();
            
        }
        
    }