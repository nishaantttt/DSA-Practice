class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max_Area = 0;
    while(l<r){
        int area = Math.min(height[l],height[r]) * (r-l);
        max_Area = Math.max(area,max_Area);

        if(height[l]< height[r]){
            l++;
        }
        else r--;
    }

        return max_Area;
    }
}