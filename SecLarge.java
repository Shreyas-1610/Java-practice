public class SecLarge {
    public static int second(int arr[],int n){
        if(n<2) return -1;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        int i;
        for(i=0;i<n;i++){
            if(arr[i]>large){
                secondLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge=arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int arr[]={12,22,1,20,5};
        int n=arr.length;
        System.out.println("Second largest: "+second(arr, n));
    }
}
