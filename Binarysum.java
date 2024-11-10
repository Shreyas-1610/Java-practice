
import java.util.Scanner;

public class Binarysum {
    public static int countBinary(int n){
        int cnt=0;
        while(n>0){
            cnt+=n&1;
            n>>=1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countBinary(n));
        sc.close();
    }
}
