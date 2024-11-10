public class largest {
    public static  int large(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,3,6,22,17};
        System.out.println("Largest element is: "+large(arr));
    }
}
