public class Superior {
    public static int superior(int[] arr){
        int n=arr.length;
        int max=arr[n-1];
        if(n==1) return 1;
        int cnt=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[]={12};
        int ans=superior(arr);
        System.out.println(ans);
    }
}
