class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i: candies){
            if(max<i)max=i;
        }
        max-=extraCandies;
        List<Boolean> list=new ArrayList<Boolean>();
        for(int i: candies){
            list.add((i>=max));
        }
        return list;
    }
}
