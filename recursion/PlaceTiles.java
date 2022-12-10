//place tiles of size 1Xm in a floor of size nXm
public class PlaceTiles {
    public static int placeTile(int n,int m ) {
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // if vertically palced
        int verPlacement = placeTile((n-m), m);
        int horPlacement = placeTile((n-1), m);
        return verPlacement+horPlacement;
    }
    public static void main(String[] args) {
        int n = 4,m=2;
        System.out.println(placeTile(n, m));
    }
    
}
