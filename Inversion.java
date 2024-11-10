
import java.util.ArrayList;

public class Inversion {
    // public static int count(int[] arr, int n){
    //     int cnt=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             if(arr[i]>arr[j]) cnt++;
    //         }
    //     }
    //     return cnt;
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,7,6,5};
    //     int n=4;
    //     int ans=count(arr, n);
    //     System.out.println(ans);
    // }




    public static int merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left=low;
        int right=mid+1;
        int cnt=0;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                cnt+=(mid-left+1);
                right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=list.get((i-low));
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr, low, mid);
        cnt+=mergeSort(arr, mid+1, high);
        cnt+=merge(arr, low, mid, high);
        return cnt;
    }

    public static int count(int[] arr){
        return mergeSort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[]={1,7,6,5,2};
        int ans=count(arr);
        System.out.println(ans);
    }
}
