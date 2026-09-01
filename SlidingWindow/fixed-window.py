from collections import deque, Counter


def main():

    # Uncomment ONE at a time to test your solution.

    # ============================================================
    # 1. MAXIMUM SUM OF SUBARRAY OF SIZE K
    # ============================================================

    # print("max_sum_of_size_k:", max_sum_of_size_k(
    #     [2, 1, 5, 1, 3, 2], 3
    # ))  # Expected: 9


    # ============================================================
    # 2. MINIMUM SUM OF SUBARRAY OF SIZE K
    # ============================================================

    # print("min_sum_of_size_k:", min_sum_of_size_k(
    #     [2, 1, 5, 1, 3, 2], 3
    # ))  # Expected: 6


    # ============================================================
    # 3. AVERAGES OF ALL SUBARRAYS OF SIZE K
    # ============================================================

    # print("averages_of_size_k:", averages_of_size_k(
    #     [1, 2, 3, 4, 5], 3
    # ))  # Expected: [2.0, 3.0, 4.0]


    # ============================================================
    # 4. MAXIMUM AVERAGE SUBARRAY
    # ============================================================

    # print("max_average:", max_average(
    #     [1, 12, -5, -6, 50, 3], 4
    # ))  # Expected: 12.75


    # ============================================================
    # 5. MAXIMUM NUMBER OF 1s IN A WINDOW OF SIZE K
    # ============================================================

    # print("max_ones_in_window:", max_ones_in_window(
    #     [1, 0, 1, 1, 0, 1], 3
    # ))  # Expected: 2


    # ============================================================
    # 6. MAXIMUM VOWELS IN SUBSTRING OF SIZE K
    # ============================================================

    # print("max_vowels:", max_vowels(
    #     "abciiidef", 3
    # ))  # Expected: 3


    # ============================================================
    # 7. DISTINCT ELEMENTS IN EVERY WINDOW
    # ============================================================

    # print("distinct_elements_in_windows:",
    #       distinct_elements_in_windows(
    #           [1, 2, 1, 3, 4, 2, 3], 4
    #       ))
    # Expected: [3, 4, 4, 3]


    # ============================================================
    # 8. PERMUTATION IN STRING
    # ============================================================

    # print("check_inclusion:", check_inclusion(
    #     "ab", "eidbaooo"
    # ))  # Expected: True


    # ============================================================
    # 9. FIND ALL ANAGRAMS IN A STRING
    # ============================================================

    # print("find_anagrams:", find_anagrams(
    #     "cbaebabacd", "abc"
    # ))  # Expected: [0, 6]


    # ============================================================
    # 10. SLIDING WINDOW MAXIMUM
    # ============================================================

    # print("max_sliding_window:", max_sliding_window(
    #     [1, 3, -1, -3, 5, 3, 6, 7], 3
    # ))  # Expected: [3, 3, 5, 5, 6, 7]


    # ============================================================
    # 11. SLIDING WINDOW MINIMUM
    # ============================================================

    # print("min_sliding_window:", min_sliding_window(
    #     [1, 3, -1, -3, 5, 3, 6, 7], 3
    # ))  # Expected: [-1, -3, -3, -3, 3, 3]


    # ============================================================
    # 12. COUNT EVEN NUMBERS IN EVERY WINDOW
    # ============================================================

    # print("count_even_in_windows:", count_even_in_windows(
    #     [2, 1, 4, 6, 3, 8], 3
    # ))  # Expected: [2, 2, 2, 2]


    # ============================================================
    # 13. MAXIMUM SUM OF ELEMENTS SATISFYING CONDITION
    # ============================================================

    # print("max_sum_with_condition:", max_sum_with_condition(
    #     [2, 4, 1, 6, 3, 8], 3
    # ))  # Expected: 14


    # ============================================================
    # 14. DOES ANY WINDOW CONTAIN A DUPLICATE?
    # ============================================================

    # print("has_duplicate_in_every_window:",
    #       has_duplicate_in_every_window(
    #           [1, 2, 3, 1, 4, 5], 3
    #       ))
    # Expected: False

    # Try:
    #
    # print("has_duplicate_in_every_window:",
    #       has_duplicate_in_every_window(
    #           [1, 2, 3, 2, 5], 3
    #       ))
    # Expected: True


    # ============================================================
    # 15. BONUS — MAXIMUM ELEMENT FREQUENCY IN EVERY WINDOW
    # ============================================================

    # print("max_frequency_in_windows:", max_frequency_in_windows(
    #     [1, 2, 2, 3, 3, 3, 2], 4
    # ))  # Expected: [2, 2, 3, 3]


# ============================================================
# 1. MAXIMUM SUM OF SUBARRAY OF SIZE K
# ============================================================
#
# Return the maximum sum of any contiguous subarray
# containing exactly k elements.
#
# Example:
#
# nums = [2,1,5,1,3,2]
# k = 3
#
# Windows:
# [2,1,5] = 8
# [1,5,1] = 7
# [5,1,3] = 9
# [1,3,2] = 6
#
# Answer = 9
#
def max_sum_of_size_k(nums, k):
    pass


# ============================================================
# 2. MINIMUM SUM OF SUBARRAY OF SIZE K
# ============================================================
#
# Return the minimum sum of any contiguous subarray
# containing exactly k elements.
#
# Example:
#
# nums = [2,1,5,1,3,2]
# k = 3
#
# Windows:
# [2,1,5] = 8
# [1,5,1] = 7
# [5,1,3] = 9
# [1,3,2] = 6
#
# Answer = 6
#
def min_sum_of_size_k(nums, k):
    pass


# ============================================================
# 3. AVERAGES OF ALL SUBARRAYS OF SIZE K
# ============================================================
#
# Return the average of every contiguous subarray
# of exactly k elements.
#
# Example:
#
# nums = [1,2,3,4,5]
# k = 3
#
# Windows:
# [1,2,3] -> 2.0
# [2,3,4] -> 3.0
# [3,4,5] -> 4.0
#
# Answer = [2.0, 3.0, 4.0]
#
def averages_of_size_k(nums, k):
    pass


# ============================================================
# 4. MAXIMUM AVERAGE SUBARRAY
# ============================================================
#
# LeetCode 643
#
# Return the maximum average of any contiguous subarray
# containing exactly k elements.
#
# Example:
#
# nums = [1,12,-5,-6,50,3]
# k = 4
#
# Windows:
# [1,12,-5,-6] = 2
# [12,-5,-6,50] = 51
# [-5,-6,50,3] = 42
#
# Maximum average = 51 / 4
#
# Answer = 12.75
#
def max_average(nums, k):
    pass


# ============================================================
# 5. MAXIMUM NUMBER OF 1s IN A WINDOW OF SIZE K
# ============================================================
#
# Return the maximum number of 1s contained in any
# contiguous window of size k.
#
# Example:
#
# nums = [1,0,1,1,0,1]
# k = 3
#
# Windows:
# [1,0,1] -> 2
# [0,1,1] -> 2
# [1,1,0] -> 2
# [1,0,1] -> 2
#
# Answer = 2
#
def max_ones_in_window(nums, k):
    pass


# ============================================================
# 6. MAXIMUM VOWELS IN SUBSTRING OF SIZE K
# ============================================================
#
# Return the maximum number of vowels in any substring
# of length k.
#
# Vowels = a, e, i, o, u
#
# Example:
#
# s = "abciiidef"
# k = 3
#
# Windows:
# "abc" -> 1
# "bci" -> 1
# "cii" -> 2
# "iii" -> 3
# "iid" -> 2
# "ide" -> 2
# "def" -> 1
#
# Answer = 3
#
def max_vowels(s, k):
    pass


# ============================================================
# 7. DISTINCT ELEMENTS IN EVERY WINDOW
# ============================================================
#
# Return the number of distinct elements in every
# contiguous window of size k.
#
# Example:
#
# nums = [1,2,1,3,4,2,3]
# k = 4
#
# [1,2,1,3] -> 3
# [2,1,3,4] -> 4
# [1,3,4,2] -> 4
# [3,4,2,3] -> 3
#
# Answer = [3,4,4,3]
#
def distinct_elements_in_windows(nums, k):
    pass


# ============================================================
# 8. PERMUTATION IN STRING
# ============================================================
#
# LeetCode 567
#
# Return True if s2 contains a permutation of s1.
#
# Example:
#
# s1 = "ab"
# s2 = "eidbaooo"
#
# "ba" is a permutation of "ab".
#
# Answer = True
#
# HINT:
# The window size is ALWAYS s1.length().
#
def check_inclusion(s1, s2):
    pass


# ============================================================
# 9. FIND ALL ANAGRAMS IN A STRING
# ============================================================
#
# LeetCode 438
#
# Return the starting indexes of all anagrams of p
# inside s.
#
# Example:
#
# s = "cbaebabacd"
# p = "abc"
#
# Windows of size 3:
#
# "cba" -> anagram -> index 0
# "bae" -> no
# "aeb" -> no
# "eba" -> no
# "bab" -> no
# "aba" -> no
# "bac" -> no
# "acd" -> anagram -> index 6
#
# Answer = [0,6]
#
# HINT:
# Window size = p.length()
#
def find_anagrams(s, p):
    pass


# ============================================================
# 10. SLIDING WINDOW MAXIMUM
# ============================================================
#
# LeetCode 239
#
# Return the maximum value in every window of size k.
#
# Example:
#
# nums = [1,3,-1,-3,5,3,6,7]
# k = 3
#
# Windows:
#
# [1,3,-1] -> 3
# [3,-1,-3] -> 3
# [-1,-3,5] -> 5
# [-3,5,3] -> 5
# [5,3,6] -> 6
# [3,6,7] -> 7
#
# Answer = [3,3,5,5,6,7]
#
# HINT:
# This one requires a Deque.
#
def max_sliding_window(nums, k):
    pass


# ============================================================
# 11. SLIDING WINDOW MINIMUM
# ============================================================
#
# Return the minimum value in every window of size k.
#
# Example:
#
# nums = [1,3,-1,-3,5,3,6,7]
# k = 3
#
# Windows:
#
# [1,3,-1] -> -1
# [3,-1,-3] -> -3
# [-1,-3,5] -> -3
# [-3,5,3] -> -3
# [5,3,6] -> 3
# [3,6,7] -> 3
#
# Answer = [-1,-3,-3,-3,3,3]
#
# HINT:
# Use a Deque.
#
def min_sliding_window(nums, k):
    pass


# ============================================================
# 12. COUNT EVEN NUMBERS IN EVERY WINDOW
# ============================================================
#
# Return the number of even numbers in every window
# of size k.
#
# Example:
#
# nums = [2,1,4,6,3,8]
# k = 3
#
# [2,1,4] -> 2
# [1,4,6] -> 2
# [4,6,3] -> 2
# [6,3,8] -> 2
#
# Answer = [2,2,2,2]
#
def count_even_in_windows(nums, k):
    pass


# ============================================================
# 13. MAXIMUM SUM OF ELEMENTS SATISFYING CONDITION
# ============================================================
#
# For every window of size k, consider only EVEN numbers.
#
# Return the maximum sum of even numbers found in
# any window.
#
# Example:
#
# nums = [2,4,1,6,3,8]
# k = 3
#
# [2,4,1] -> 6
# [4,1,6] -> 10
# [1,6,3] -> 6
# [6,3,8] -> 14
#
# Answer = 14
#
# HINT:
# Maintain the sum of only the elements that
# satisfy the condition.
#
def max_sum_with_condition(nums, k):
    pass


# ============================================================
# 14. DOES ANY WINDOW CONTAIN A DUPLICATE?
# ============================================================
#
# Return True if ANY window of size k contains
# a duplicate element.
#
# Example:
#
# nums = [1,2,3,1,4,5]
# k = 3
#
# [1,2,3] -> no duplicate
# [2,3,1] -> no duplicate
# [3,1,4] -> no duplicate
# [1,4,5] -> no duplicate
#
# Answer = False
#
# Try:
#
# nums = [1,2,3,2,5]
# k = 3
#
# [1,2,3] -> no duplicate
# [2,3,2] -> duplicate
#
# Answer = True
#
# HINT:
# Keep track of the frequency of elements
# inside the current window.
#
def has_duplicate_in_every_window(nums, k):
    pass


# ============================================================
# 15. BONUS — MAXIMUM ELEMENT FREQUENCY IN EVERY WINDOW
# ============================================================
#
# Return the maximum frequency of any single element
# across every window of size k.
#
# Example:
#
# nums = [1,2,2,3,3,3,2]
# k = 4
#
# [1,2,2,3] -> max frequency = 2
# [2,2,3,3] -> max frequency = 2
# [2,3,3,3] -> max frequency = 3
# [3,3,3,2] -> max frequency = 3
#
# Answer = [2,2,3,3]
#
# HINT:
# Maintain the frequency of each element
# in the current window.
#
def max_frequency_in_windows(nums, k):
    pass


if __name__ == "__main__":
    main()
