
import java.util.*;

public class StringReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        
        for(char c:str.toCharArray()){
            st.push(c);
        }
        String temp="";
        while(!st.isEmpty()){
            temp+=st.pop();
        }
        System.out.println("Reverse of this String is: "+temp);

        sc.close();
    }
}