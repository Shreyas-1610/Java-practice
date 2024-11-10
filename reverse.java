class reverse{
    public static void print(int[] arr, int n){
        System.out.print("Reversed Array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rev(int[] arr, int n){
        int start=0, end=n-1;
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        print(arr, n);
    }
    public static void main(String[] args) {
        int n=5;
        int arr[] = {7,2,3,4,5};
        rev(arr, n);
    }
}