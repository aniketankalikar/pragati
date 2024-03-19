package leetcode.problems;

public class Container_With_Most_Water_11 {

    public int maxArea(int[] height) {
        int area =0;
        int res  = 0;
        int l = 0, r = height.length -1;
        while(l<r)
        {
            area = (r-l)* Math.min(height[l], height[r]);
            res = Math.max(res, area);
            if(height[l] < height[r])
                l++;
            else
                r--;

        }

        return res;

    }

}
