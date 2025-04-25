class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0;
        int len=nums.length;
        if(len==1) return ;
        for(int i=0;i<len;i++){
            if(nums[i]!=0){
                if(i!=ind)nums[ind]=nums[i];
                ind++;
            }
        }
        for(;ind<len;ind++)nums[ind]=0;
        return ;
    }
}
