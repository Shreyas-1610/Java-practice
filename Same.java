
import java.util.Scanner;

public class Same{
    public static int equilibrium(int[] arr, int n){
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int left=0, right=0;

        for(int i=1;i<n;i++){
            left+=arr[i-1];
            arr1[i]=left;
        }

        for(int i=n-2;i>=0;i--){
            right+=arr[i+1];
            arr2[i]=right;
        }

        for(int i=0;i<n;i++){
            if(arr1[i]==arr2[i]) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = equilibrium(arr, n);
        System.out.println(ans);
        sc.close();
    }
}