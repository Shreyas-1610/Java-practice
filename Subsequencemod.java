
import java.util.*;

public class Subsequencemod {
    static int maxi=0;
    public static void solve(int ind, List<Integer> arr, List<Integer> aux, int k){
        if(ind==arr.size()){
            if(maxi<aux.size()) maxi=aux.size();
            return;
        }
        if(aux.size()==0 || (arr.get(ind)-aux.get(aux.size()-1))%k==0){
            aux.add(arr.get(ind));
            solve(ind+1, arr, aux, k);
            aux.remove(aux.size()-1);
        }
        solve(ind+1, arr, aux, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> aux = new ArrayList<>();
        int idx = 0;

        solve(idx, arr, aux, k);

        System.out.println(maxi);

        sc.close();
    }
}
