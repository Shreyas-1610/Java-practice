public class Substring{
    public static long atMost(String s, int k){
        if(k<0) return 0;
        int i=0, j=0, cnt=0;
        long ans=0;
        int arr[] = new int[26];
        while(j<s.length()){
            arr[s.charAt(j)-'a']++;
            if(arr[s.charAt(j)-'a']==1) cnt++;
            
            while(cnt>k){
                arr[s.charAt(i)-'a']--;
                if(arr[s.charAt(i)-'a']==0) cnt--;
                
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
        
    }
   public static long substrCount (String s, int k) {
        // your code here
        return atMost(s,k)-atMost(s,k-1);
    }
    public static void main(String[] args) {
        String s="aabbba";
        int k=2;
        long ans = substrCount(s,k);
        System.out.println(ans);
    }
}