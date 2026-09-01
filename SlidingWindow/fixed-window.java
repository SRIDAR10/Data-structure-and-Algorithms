import java.util.*;

class Main {

    public static void main(String[] args) {

        // Uncomment ONE at a time to test your solution.

        // System.out.println("maxSumOfSizeK : " + maxSumOfSizeK(
        //     new int[]{2, 1, 5, 1, 3, 2}, 3
        // )); // Expected: 9

        // System.out.println("maxSumOfSizeK: " +minSumOfSizeK(
        //     new int[]{2, 1, 5, 1, 3, 2}, 3
        // )); // Expected: 6

        // System.out.println("averagesOfSizeK :" + Arrays.toString(averagesOfSizeK(
        //     new int[]{1, 2, 3, 4, 5}, 3
        // ))); // Expected: [2.0, 3.0, 4.0]

        // System.out.println("maxAverage :" + maxAverage(
        //     new int[]{1, 12, -5, -6, 50, 3}, 4
        // )); // Expected: 12.75

        // System.out.println("maxOnesInWindow : " + maxOnesInWindow(
        //     new int[]{1, 0, 1, 1, 0, 1}, 3
        // )); // Expected: 2

        // System.out.println("maxVowels: " + maxVowels(
        //     "abciiidef", 3
        // )); // Expected: 3

        // System.out.println(Arrays.toString(distinctElementsInWindows(
        //     new int[]{1, 2, 1, 3, 4, 2, 3}, 4
        // ))); // Expected: [3, 4, 4, 3]

        // System.out.println(checkInclusion(
        //     "ab", "eidbaooo"
        // )); // Expected: true

        System.out.println(Arrays.toString(findAnagrams(
            "cbaebabacd", "abc"
        ).stream().mapToInt(Integer::intValue).toArray()));
        // Expected: [0, 6]

        // System.out.println(Arrays.toString(maxSlidingWindow(
        //     new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3
        // ))); // Expected: [3, 3, 5, 5, 6, 7]

        // System.out.println(Arrays.toString(minSlidingWindow(
        //     new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3
        // ))); // Expected: [-1, -3, -3, -3, 3, 3]

        // System.out.println(countEvenInWindows(
        //     new int[]{2, 1, 4, 6, 3, 8}, 3
        // )); // Expected: [2, 2, 2, 2]

        // System.out.println(maxSumWithCondition(
        //     new int[]{2, 4, 1, 6, 3, 8}, 3
        // )); // Expected: 17

        // System.out.println(hasDuplicateInEveryWindow(
        //     new int[]{1, 2, 3, 1, 4, 5}, 3
        // )); // Expected: false
    }


    /*
     * ============================================================
     * 1. MAXIMUM SUM OF SUBARRAY OF SIZE K
     * ============================================================
     *
     * Return the maximum sum of any contiguous subarray
     * containing exactly k elements.
     *
     * Example:
     * nums = [2,1,5,1,3,2], k = 3
     * Windows:
     * [2,1,5] = 8
     * [1,5,1] = 7
     * [5,1,3] = 9
     * [1,3,2] = 6
     *
     * Answer = 9
     */
    static int maxSumOfSizeK(int[] nums, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for(int i = 0; i<k; i++){
            windowSum = windowSum + nums[i];
        }
        maxSum = windowSum;
        for(int right = k; right < nums.length; right++){
            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[right - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }


    /*
     * ============================================================
     * 2. MINIMUM SUM OF SUBARRAY OF SIZE K
     * ============================================================
     *
     * Return the minimum sum of any contiguous subarray
     * containing exactly k elements.
     *
     * Example:
     * nums = [2,1,5,1,3,2], k = 3
     * Answer = 6
     */
    static int minSumOfSizeK(int[] nums, int k) {
        int minSum = 0;
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum = windowSum + nums[i];
        }
        minSum = windowSum;

        for(int right = k; right < nums.length; right++){
            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[right-k];
            minSum = Integer.min(minSum, windowSum);
        }
        return minSum;
    }


    /*
     * ============================================================
     * 3. AVERAGES OF ALL SUBARRAYS OF SIZE K
     * ============================================================
     *
     * Return the average of every contiguous subarray
     * of exactly k elements.
     *
     * Example:
     * nums = [1,2,3,4,5], k = 3
     *
     * Answer:
     * [2.0, 3.0, 4.0]
     */
    static double[] averagesOfSizeK(int[] nums, int k) {
        double average[] = new double[k];
        double windowSum = 0;
        for(int i =0; i<k; i++){
            windowSum = windowSum + nums[i];
        }
        average[0] = windowSum/k;
        for(int right = k; right< nums.length; right++){
            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[right-k];
            average[right-k+1] = windowSum/k;
    }
        return average;
    }


    /*
     * ============================================================
     * 4. MAXIMUM AVERAGE SUBARRAY
     * ============================================================
     *
     * LeetCode 643
     *
     * Return the maximum average of any contiguous subarray
     * containing exactly k elements.
     *
     * Example:
     * nums = [1,12,-5,-6,50,3], k = 4
     * Answer = 12.75
     */
    static double maxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for(int i=0; i<k; i++){
            windowSum = windowSum + nums[i];
        }
        maxSum = windowSum;
        for(int right = k; right < nums.length; right++){
            windowSum = windowSum + nums[right];
            windowSum = windowSum - nums[right-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum/k;
    }


    /*
     * ============================================================
     * 5. MAXIMUM NUMBER OF 1s IN A WINDOW OF SIZE K
     * ============================================================
     *
     * Return the maximum number of 1s contained in any
     * contiguous window of size k.
     *
     * Example:
     * nums = [1,0,1,1,0,1], k = 3
     *
     * Windows:
     * [1,0,1] -> 2
     * [0,1,1] -> 2
     * [1,1,0] -> 2
     * [1,0,1] -> 2
     *
     * Answer = 2
     */
    static int maxOnesInWindow(int[] nums, int k) {
        int maxOnes = 0;
        int windowOnes = 0;
        for(int i=0;i<k;i++){
            if(nums[i] == 1){
                windowOnes = windowOnes + 1;
            }
        }
        maxOnes = windowOnes;

        for(int right = k; right < nums.length; right++){
           if(nums[right] == 1){
             windowOnes =  windowOnes + 1;
            }
            if(nums[right-k] == 1){
                windowOnes = windowOnes - 1;
            }
            maxOnes = Math.max(maxOnes, windowOnes);
        }
        return maxOnes;
    }


    /*
     * ============================================================
     * 6. MAXIMUM VOWELS IN SUBSTRING OF SIZE K
     * ============================================================
     *
     * Return the maximum number of vowels in any substring
     * of length k.
     *
     * Vowels = a, e, i, o, u
     *
     * Example:
     * s = "abciiidef", k = 3
     *
     * Answer = 3
     */
    static int maxVowels(String s, int k) {
        int maxVowels = 0;
        int windowVowels = 0;
        for(int i=0;i< k;i++){
            if(isVowel(s.charAt(i))){
                windowVowels++;
            }
        }
        maxVowels = windowVowels;
        for(int right = k; right < s.length(); right++){
            if(isVowel(s.charAt(right))){
                windowVowels++;
            }
            if(isVowel(s.charAt(right-k))){
                windowVowels--;
            }
           maxVowels = Math.max(maxVowels, windowVowels);
        }
        return maxVowels;
    }

    static boolean isVowel(char character){
        return character == 'a' || character == 'e' || character =='i' || character == 'o' || character =='u';
        }


    /*
     * ============================================================
     * 7. DISTINCT ELEMENTS IN EVERY WINDOW
     * ============================================================
     *
     * Return the number of distinct elements in every
     * contiguous window of size k.
     *
     * Example:
     *
     * nums = [1,2,1,3,4,2,3]
     * k = 4
     *
     * [1,2,1,3] -> 3
     * [2,1,3,4] -> 4
     * [1,3,4,2] -> 4
     * [3,4,2,3] -> 3
     *
     * Answer = [3,4,4,3]
     */
    static int[] distinctElementsInWindows(int[] nums, int k) {
        return null;
    }


    /*
     * ============================================================
     * 8. PERMUTATION IN STRING
     * ============================================================
     *
     * LeetCode 567
     *
     * Return true if s2 contains a permutation of s1.
     *
     * Example:
     * s1 = "ab"
     * s2 = "eidbaooo"
     *
     * "ba" is a permutation of "ab".
     *
     * Answer = true
     *
     * HINT:
     * The window size is ALWAYS s1.length().
     */
    static boolean checkInclusion(String s1, String s2) {
        return false;
    }


    /*
     * ============================================================
     * 9. FIND ALL ANAGRAMS IN A STRING
     * ============================================================
     *
     * LeetCode 438
     *
     * Return the starting indexes of all anagrams of p
     * inside s.
     *
     * Example:
     *
     * s = "cbaebabacd"
     * p = "abc"
     *
     * Answer = [0,6]
     *
     * HINT:
     * Window size = p.length()
     */
    static List<Integer> findAnagrams(String s, String p) {
        return null
    }


    /*
     * ============================================================
     * 10. SLIDING WINDOW MAXIMUM
     * ============================================================
     *
     * LeetCode 239
     *
     * Return the maximum value in every window of size k.
     *
     * Example:
     *
     * nums = [1,3,-1,-3,5,3,6,7]
     * k = 3
     *
     * Answer:
     * [3,3,5,5,6,7]
     *
     * HINT:
     * This one requires a Deque.
     */
    static int[] maxSlidingWindow(int[] nums, int k) {
        return null;
    }


    /*
     * ============================================================
     * 11. SLIDING WINDOW MINIMUM
     * ============================================================
     *
     * Return the minimum value in every window of size k.
     *
     * Example:
     *
     * nums = [1,3,-1,-3,5,3,6,7]
     * k = 3
     *
     * Answer:
     * [-1,-3,-3,-3,3,3]
     *
     * HINT:
     * Use a Deque.
     */
    static int[] minSlidingWindow(int[] nums, int k) {
        return null;
    }


    /*
     * ============================================================
     * 12. COUNT EVEN NUMBERS IN EVERY WINDOW
     * ============================================================
     *
     * Return the number of even numbers in every window
     * of size k.
     *
     * Example:
     *
     * nums = [2,1,4,6,3,8]
     * k = 3
     *
     * [2,1,4] -> 2
     * [1,4,6] -> 2
     * [4,6,3] -> 2
     * [6,3,8] -> 2
     *
     * Answer = [2,2,2,2]
     */
    static int[] countEvenInWindows(int[] nums, int k) {
        return null;
    }


    /*
     * ============================================================
     * 13. MAXIMUM SUM OF ELEMENTS SATISFYING CONDITION
     * ============================================================
     *
     * For every window of size k, consider only EVEN numbers.
     *
     * Return the maximum sum of even numbers found in
     * any window.
     *
     * Example:
     *
     * nums = [2,4,1,6,3,8]
     * k = 3
     *
     * [2,4,1] -> 6
     * [4,1,6] -> 10
     * [1,6,3] -> 6
     * [6,3,8] -> 14
     *
     * Answer = 14
     *
     * NOTE:
     * The test above should therefore expect 14.
     */
    static int maxSumWithCondition(int[] nums, int k) {
        return 0;
    }


    /*
     * ============================================================
     * 14. DOES ANY WINDOW CONTAIN A DUPLICATE?
     * ============================================================
     *
     * Return true if ANY window of size k contains
     * a duplicate element.
     *
     * Example:
     *
     * nums = [1,2,3,1,4,5]
     * k = 3
     *
     * [1,2,3] -> no duplicate
     * [2,3,1] -> no duplicate
     * [3,1,4] -> no duplicate
     * [1,4,5] -> no duplicate
     *
     * Answer = false
     *
     * Try:
     * nums = [1,2,3,2,5]
     * k = 3
     *
     * [2,3,2] contains duplicate.
     *
     * Answer = true
     */
    static boolean hasDuplicateInEveryWindow(int[] nums, int k) {
        return false;
    }


    /*
     * ============================================================
     * 15. BONUS — MAXIMUM ELEMENT FREQUENCY IN EVERY WINDOW
     * ============================================================
     *
     * Return the maximum frequency of any single element
     * across every window of size k.
     *
     * Example:
     *
     * nums = [1,2,2,3,3,3,2]
     * k = 4
     *
     * [1,2,2,3] -> max frequency = 2
     * [2,2,3,3] -> max frequency = 2
     * [2,3,3,3] -> max frequency = 3
     * [3,3,3,2] -> max frequency = 3
     *
     * Answer = [2,2,3,3]
     */
    static int[] maxFrequencyInWindows(int[] nums, int k) {
        return null;
    }
}  
