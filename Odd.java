public class Odd {
    public static int odd(int[] arr){
        int n=arr.length;
        int odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                odd+=arr[i];
            }
        }
        return odd;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,3,7,8};
        int ans=odd(arr);
        System.out.println(ans);
    }
}
