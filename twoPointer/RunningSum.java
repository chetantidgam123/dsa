// Running Sum of an Array

public class RunningSum {
    public static void main(String[] args) {
        int arr []= new int[]{1 ,2 ,3 ,4 ,5};
        int arr1 []= new int[arr.length];
        for(int i =0;i<arr.length;i++){
            if(i>0){
                arr1[i]=arr1[i-1]+arr[i];
            }else{
                arr1[i]=arr[i];
            }
            System.out.println(arr1[i]+" ");
        }
    }
}
