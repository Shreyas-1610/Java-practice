import java.util.Scanner;

public class Plane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = 1+(n*(n+1)/2);
        System.out.println(ans);
        sc.close();
    }
}
