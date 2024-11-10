
import java.util.Scanner;

public class Diff {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff =sc.nextInt();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(Math.abs(arr[i]-num)<=diff){
                cnt++;
            }
        }
        if(cnt>0){
            System.out.println(cnt);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
