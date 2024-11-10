public class Missing{
    public static int missingNumber(int[] nums, int n){
        int sum=(n*(n+1))/2;
        int currSum=0;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
        }
        int miss=sum-currSum;
        return miss;
    }
    public static void main(String[] args) {
        int n=5;
        int nums[]={1,2,4,5};
        int ans =missingNumber(nums,n);
        System.out.println("Missing number is: "+ans);
    }
}