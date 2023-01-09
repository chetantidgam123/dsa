package Stack;
import java.util.*;
public class NextSmallRight {
    public static void main(String[] args) {
        int arr []=new int[]{8,5,4,9,2};
        int arr1[]= new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1;i>=0;i--){
            if(st.isEmpty()){
                arr1[i]=-1;
            }else if(!st.isEmpty() && st.peek()<arr[i]){
                arr1[i]= st.peek();
            }else if(!st.isEmpty() && st.peek()>=arr[i]){
                while(!st.isEmpty() && st.peek()>=arr[i]){
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
