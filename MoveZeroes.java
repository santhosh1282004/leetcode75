class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                if(i!=ind){
                    nums[ind]=nums[i];
                    nums[i]=0;
                }
                ind++;
            }
        }
        return ;
    }
}
