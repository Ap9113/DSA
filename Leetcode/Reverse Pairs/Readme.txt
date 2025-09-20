## Reverse Pairs

### Problem Statement
Given an array of integers, count the number of reverse pairs. A reverse pair is defined as (i, j) where i < j and nums[i] > 2 * nums[j].

---

### Brute-Force Approach
1. Use two nested loops to check every possible pair (i, j) with i < j.
2. If nums[i] > 2 * nums[j], increment the count.

**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

### Optimal Approach (Modified Merge Sort)
1. Use a modified merge sort to count reverse pairs while sorting the array.
2. For each merge step, count the number of valid reverse pairs between the left and right halves.
3. Merge the two halves as in standard merge sort.

**Time Complexity:** O(n log n)
**Space Complexity:** O(n)
