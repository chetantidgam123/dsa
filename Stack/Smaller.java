package Stack;

/*
 * Smaller
 */
import java.util.*;
public class Smaller {

    public static void main(String[] args) {
        int arr [] = new int[]{5,4,3,5,0};
        int arr1 [] = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(st.isEmpty()){
                arr1[i]=-1;
            }
            else if(!st.isEmpty() && st.peek()<arr[i]){
                arr1[i]=st.peek();
            }else if(!st.isEmpty() && st.peek()>=arr[i]){
                while(!st.isEmpty() && st.peek()>arr[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    arr1[i]=-1;
                }else{
                    arr1[i]=st.peek();

                }
            }
            st.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}