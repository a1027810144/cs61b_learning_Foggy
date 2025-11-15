public class winposnum {
    public static int[] winpos_c(int[] nums,int n){
        if (nums.length>0){
            for(int i = 0;i<nums.length;i++){
                if(nums[i]<=0){
                    continue;
                }
                else{
                    int step=1;
                    int temp=nums[i];
                    while(step<=n && step+i<nums.length){
                        temp+=nums[step+i];
                        step++;
                    }
                    nums[i]=temp;
                }
            }
            return nums;
        }
        else{
            System.out.println("Array is empty");
            return nums;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,-3,4,5,4};
        int n=3;
        winpos_c(nums,n);
        System.out.println(java.util.Arrays.toString(nums));
    }
    
}
