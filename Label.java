
import java.util.Scanner;

public class Label {
    public static String label(int[] arr,int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sb.append("even ");
            }
            else{
                sb.append("odd ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String ans = label(arr, n);
        System.out.println(ans);
        sc.close();
    }
}