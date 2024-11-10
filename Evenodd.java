
import java.util.Scanner;

public class Evenodd {
    public static int totalSum(int[] arr, int n){
        if(n==0) return 0;
        if(n==1) return arr[0];
        int sum=arr[0], xorr=arr[1];
        for(int i=2;i<n;i++){
            if(i%2==0) sum+=arr[i];
            else xorr=xorr^arr[i];
        }
        return sum+xorr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(totalSum(arr, n));
        sc.close();
    }
}
