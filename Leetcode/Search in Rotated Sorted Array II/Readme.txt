## Search in Rotated Sorted Array II

### Problem Statement
Given a rotated sorted array that may contain duplicates, determine if a target value exists in the array.

---

### Brute-Force Approach
1. Iterate through the array and check if any element equals the target.
2. Return true if found, false otherwise.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Modified Binary Search)
1. Use binary search to find the target.
2. If `nums[l] == nums[mid] == nums[h]`, increment `l` and decrement `h` to skip duplicates.
3. If the left half is sorted (`nums[l] <= nums[mid]`):
    - If the target is in the left half, search left; otherwise, search right.
4. If the right half is sorted:
    - If the target is in the right half, search right; otherwise, search left.
5. Repeat until the target is found or the search space is empty.

**Time Complexity:** O(log n) (average), O(n) (worst case with many duplicates)
**Space Complexity:** O(1)