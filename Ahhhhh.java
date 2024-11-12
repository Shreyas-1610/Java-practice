
import java.util.Scanner;

public class Ahhhhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int total=0;
        double avg=0.0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        avg = total/(double)n;
        System.out.printf("%d\n%.2f",total,avg);
        sc.close();
    }
}
