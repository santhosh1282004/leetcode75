class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0, t = flowerbed.length, k = 0;
        while (k < t && count < n) {
            if (flowerbed[k] == 0 && (k + 1 == t || flowerbed[k + 1] == 0)) {
                flowerbed[k] = 1;
                count++;
                k++;
            } else if (flowerbed[k] == 1) k++;
            k++;
        }
        return count == n;
    }
}
