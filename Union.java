
import java.util.ArrayList;

public class Union{
    public static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m){
        int i=0, j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i])
                    ans.add(arr1[i]);
                    i++;
            }
            else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j])
                    ans.add(arr2[j]);
                j++;              
            }
        }
        while(i<n){
            if(ans.get(ans.size()-1)!=arr1[i])
                ans.add(arr1[i]);
            i++;
        }
        while(j<m){
            if(ans.get(ans.size()-1)!=arr2[j])
                ans.add(arr2[j]);
                j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10, m=7;
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={1,3,5,7,9,11,13};
        ArrayList<Integer> union = FindUnion(arr1, arr2, n, m);
        System.out.println("Union of arr1 and arr2 is: ");
        for(int it:union){
            System.out.print(it+" ");
        }

    }
}