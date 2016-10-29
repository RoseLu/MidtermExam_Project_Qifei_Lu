import java.util.HashMap;
import java.util.Map;

/**
 * Created by qiqi on 2016/10/28.
 */
public class TwoSum {
    //Time Complexity: O(n)
    public int twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;
            int count = 0;
            Map<Integer, Boolean> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], true);             //put every number into the map and set the initial value for true
            }
            for (int i = 0; i < nums.length; i++)
            {
                int number = nums[i];
                if (map.containsKey(target - number) && map.get(target - number)) {
                    count++;                            //if there exits a pair, that means these two numbers has been used that cannot use again, therefore, set these two false
                    map.put(number, false);
                    map.put(target - number, false);
                }
            }
            return count;
        }

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {1,5,2,4,3,6};
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(nums1,10));//Output:0
        System.out.println(ts.twoSum(nums2, 7));//Output:3
    }
}
