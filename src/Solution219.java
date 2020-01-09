import java.util.Arrays;

class Solution219 {
    /**
     * 219. Contains Duplicate II
     */
    public static boolean duplicateExists(int number, int[] numSlice) {
        for (int j = 0; j < numSlice.length; j++) {
            if (number == numSlice[j]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // Edge cases
        if (k <= 0) {
            return false;
        }

        if (nums.length <= 1) {
            return false;
        }

        if (nums[0] == nums[1]) {
            return true;
        }
        int start;
        int end;
        boolean returnValue;
        for (int i = 0; i <= nums.length - 2; i++) {
            start = i + 1;
            if (nums.length < start + k) {
                end = nums.length;
            } else {
                end = start + k;
            }
            // Get the slice of the Array
            int[] slice = Arrays.copyOfRange(nums, start, end);
            returnValue = duplicateExists(nums[i], slice);
            if (returnValue) {
                return returnValue;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
         *
         * Example 1:
         *
         * Input: nums = [1,2,3,1], k = 3
         * Output: true
         *
         *
         * Example 2:
         *
         * Input: nums = [1,0,1,1], k = 1
         * Output: true
         *
         *
         * Example 3:
         *
         * Input: nums = [1,2,3,1,2,3], k = 2
         * Output: false
         */
        int[] nums = {1, 2, 3, 1}; // k = 3

        System.out.println("nums = [1,2,3,1], k = 3 true = " + containsNearbyDuplicate(nums, 3));

        int[] nums2 = {1, 0, 1, 1};
        System.out.println("nums = [1,0,1,1], k = 1 true = " + containsNearbyDuplicate(nums2, 1));

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        System.out.println("nums = [1,2,3,1,2,3], k = 2 false = " + containsNearbyDuplicate(nums3, 2));

        int[] nums4 = {99, 99};
        System.out.println("nums[99,99], k 2 true = " + containsNearbyDuplicate(nums4, 2));

        System.out.println("nums[99,99], k 5 true = " + containsNearbyDuplicate(nums4, 5));

        int [] nums5 = {9};
        System.out.println("nums[], k 5 false = " + containsNearbyDuplicate(nums5, 5));

        int [] nums6 = {1,2,3,4,5,6,7,8,9,9};
        // 3

        System.out.println("nums[1,2,3,4,5,6,7,8,9,9], k 3 true = " + containsNearbyDuplicate(nums6, 3));
    }
}
