package leetcode2;

public class 两数之和 { public int[] twoSum(int[] nums, int target) {
    int len=nums.length;int i,j;
    for(i=0;i<len;i++){
        for (j = i + 1; j < len; j++){
            if (nums[i] + nums[j] ==target)
                return new int []{i,j};
        }
    }return new int[0];

}
}
