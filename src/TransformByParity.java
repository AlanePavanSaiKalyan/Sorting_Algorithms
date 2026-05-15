public class TransformByParity {
    //3467. Transform Array by Parity
    public int[] transformArray(int[] nums) {
        int n=nums.length;
        int even=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                even++;
            }
        }
        for(int i=0;i<even;i++){
            nums[i]=0;
        }
        for(int i=even;i<nums.length;i++){
            nums[i]=1;
        }
        return nums;

    }

    static void main(String[] args) {
        int [] a =new TransformByParity().transformArray(new int[]{1,5,1,4,2});
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
    }
}
