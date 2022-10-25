class TwoSum {
    public static void main(String args[]) {
        int[] nums = {-1, -2, -3, -4, -5};
        int target = -8;
        int result[] = twoSum(nums, target);
        for(int i : result)
        {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    result[0] = i;
                    result[1]= j;
                    break;
                }
            }
        }
        return result;
    }
}
