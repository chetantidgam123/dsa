/**
 * RotateArray from  3 times
 */
import java.util.*;
public class RotateArray {
public static void reverse(int a [],int i,int j) {
    int li = i;
    int ri = j;
    while(li<ri){
        int temp = a[li];
        a[li] = a[ri];
        a[ri]=temp;
        li++;
        ri--;
    }
}
public static void rotate(int[] a,int k) {
    k = k%a.length;
    if(k<0){
        k= k+a.length;
    }
    reverse(a, 0, a.length-k-1);
    reverse(a, a.length-k,a.length-1);
    reverse(a, 0, a.length-1);
}
    public static void main(String[] args) {
        int arr [] = new int[]{1,5,9,7,8,6,5};
        int  k =3;
        rotate(arr,k);
System.out.println(Arrays.toString(arr));
    }
}