
import java.util.HashMap;
import java.util.Scanner;

public class Ahhhhhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> sum = new HashMap<>();
        HashMap<String, Integer> cnt = new HashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String id = parts[0];
            int value = Integer.parseInt(parts[1]);

            sum.computeIfAbsent(id, k->0);
            cnt.computeIfAbsent(id, k->0);

            sum.put(id, sum.get(id)+value);
            cnt.put(id, cnt.get(id)+1);
        }
        String maxAvgId="";
        double maxAvg = 0.0;
        for(String id: sum.keySet()){
            double average = sum.get(id)/(double)cnt.get(id);
            if(average>maxAvg){
                maxAvgId=id;
                maxAvg = average;
            }
        }
        System.out.printf("%s\n%.2f",maxAvgId, maxAvg);
        sc.close();
    }
}
