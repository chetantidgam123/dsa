import java.util.ArrayList;
//print the subset of first n natural number
public class subSet {
    public static void printsubset(ArrayList<Integer> subset) {
        for(int i =0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        } 
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subSet) {
        if(n==0){
            printsubset(subSet);
            return;
        }
        // add hoga
     subSet.add(n);
     findSubset(n-1 , subSet);
     
     //  add nahi hoga
     subSet.remove(subSet.size()-1);
     findSubset(n-1 , subSet);
     

    }
    public static void main(String[] args) {
            int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
        }
    }

