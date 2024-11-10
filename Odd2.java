public class Odd2 {
    public static int ood(int n){
        while(n>9){
            if(n%2==0){
                n=(n-2)/2;
            }
            else{
                n=n/2;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int n=10;
        int ans=ood(n);
        System.out.println(ans);
    }
}
