## 3Sum

### Problem Statement
Given an array of integers, find all unique triplets in the array which give the sum of zero.

---

### Brute-Force Approach
1. Use three nested loops to check every possible triplet `(i, j, k)`.
2. For each triplet, check if `nums[i] + nums[j] + nums[k] == 0`.
3. Store unique triplets in a set or list to avoid duplicates.

**Time Complexity:** O(n³)
**Space Complexity:** O(n²) (for storing unique triplets)

---

### Better Approach (HashSet)
1. For each element, fix one number and use a HashSet to find pairs that sum to the negative of the fixed number.
2. Iterate through the array, for each `i`, use a HashSet to check if `-(nums[i] + nums[j])` exists for the remaining elements.
3. Store unique triplets to avoid duplicates.

**Time Complexity:** O(n²)
**Space Complexity:** O(n²)

---

### Optimal Approach (Sorting + Two Pointers)
1. Sort the array.
2. For each index `i`, use two pointers (`left` and `right`) to find pairs such that `nums[i] + nums[left] + nums[right] == 0`.
3. Skip duplicates to ensure unique triplets.

**Time Complexity:** O(n²)
**Space Complexity:** O(n) (for storing results)
