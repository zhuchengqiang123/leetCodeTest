public class maxArea {
    /*给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。

    找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

    返回容器可以储存的最大水量。

    说明：你不能倾斜容器。*/

    public static int maxArea(int[] height) {
        int[] arr = height;
        int maxArea = 0;
        int left = 0, right = arr.length-1;
        int h, w, area;
        while (left < right) {

            boolean b = arr[left] < arr[right];
            h = b ? arr[left] : arr[right];
            w = right - left;
            area = h * w;
            System.out.println("底:"+w+" 高:"+h+" 面积 "+area);
            if (area > maxArea) maxArea = area;
            if (b) {
                left++;
            } else {
                right--;
            }
        }
//        System.out.println(maxArea);

        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        int[] arr1 = new int[]{1,8,6,2,5,4,8,3,7};
//        System.out.println(arr1.length);
        int i = maxArea(arr);
        System.out.println(i);
    }
}
