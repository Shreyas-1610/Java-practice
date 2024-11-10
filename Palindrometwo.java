
import java.util.Scanner;

public class Palindrometwo {
    public static int isPalindrome(int n){
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            int c=(a*a+b*b)%47;
            a=b;
            b=c;
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
