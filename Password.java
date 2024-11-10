
import java.util.Scanner;

public class Password {
    public static boolean checkPassword(char[] str, int n){
        if(n<4) return false;
        if(str[0]-'0'>=0 && str[0]-'0'<=9) return false;
        int num=0, cap=0;
        for(int i=0;i<n;i++){
            if(str[i]==' ' || str[i]=='/') return false;

            if(str[i]>=65 && str[i]<=90) cap++;

            else if(str[i]-'0'>=0 && str[i]-'0'<=9) num++;
        }
        return cap>0 && num>0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = sc.nextInt();
        char[] c = s.toCharArray();
        System.out.println(checkPassword(c,n));
        sc.close();
    }
}
