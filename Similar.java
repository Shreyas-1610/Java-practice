
import java.util.Scanner;

public class Similar {
    public static boolean similar(String[] arr, int n, String s){
        for(int i=0;i<n;i++){
            if(arr[i].equals(s)){
                 return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String s = sc.nextLine();
        if(similar(arr,n,s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
