
import java.util.Scanner;

public class Split {
    public static int largest(String s){
        String ans="";
        String[] words = s.split("\\.");
        for(String word:words){
            if(word.length()>ans.length()){
                ans=word;
            }
        }
        return ans.length();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = largest(s);
        System.out.println(ans);
        sc.close();
    }
}
