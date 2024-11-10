public class Lowerletter{
    public static String lower(String input){
        StringBuilder ans = new StringBuilder();
        for(char c: input.toCharArray()){
            if(Character.isLowerCase(c)){
                ans.append(c);
            }
        }
        int size = ans.length();
        ans.append(size);

        return ans.toString();
    }
    public static void main(String[] args) {
        String value = "This is a Science";
        String result = lower(value);
        System.out.println(result);
    }
}