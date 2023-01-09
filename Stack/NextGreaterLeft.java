package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterLeft {
    public static void main(String[] args) {
        int arr[] = new int []{8,7,5,8,6,9};
        int arr1 [] = new int[arr.length];
        Stack<Integer> Stack = new Stack<>();
        for(int i =0;i<arr.length;i++){
            if(Stack.isEmpty()){
                arr1[i]=-1;
            }else if(!Stack.isEmpty() && Stack.peek()>arr[i]){
                arr1[i] = Stack.peek();
            }else if(!Stack.isEmpty() && Stack.peek()<=arr[i]){
                while (!Stack.isEmpty() && Stack.peek()<=arr[i]) {
                    Stack.pop();
                }
                if(Stack.isEmpty()){
                    arr1[i]=-1;
                }else{
                    arr1[i]=-Stack.peek();
                }
            }
            Stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr1));
    }
}
