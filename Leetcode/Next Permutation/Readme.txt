## Next Permutation

### Problem Statement
Given an array of numbers representing a permutation, rearrange the numbers to form the next lexicographically greater permutation. If such arrangement is not possible, rearrange it as the lowest possible order (sorted in ascending order).

---

### Brute-Force Approach

1. Generate all possible permutations of the array.
2. Sort all permutations in lexicographical order.
3. Find the current permutation in the sorted list.
4. Return the next permutation in the list (or the first if at the end).

**Time Complexity:** O(n! * n) (generating and sorting all permutations)
**Space Complexity:** O(n! * n)

---

### Optimal Approach

1. **Find the first decreasing element from the end:**
   - Traverse the array from right to left and find the first index `i` such that `nums[i] < nums[i + 1]`.
   - If no such index exists, the array is the highest permutation. Reverse the entire array to get the lowest permutation.

2. **Find the element just larger than nums[i]:**
   - Again, traverse from the end and find the first index `j` such that `nums[j] > nums[i]`.

3. **Swap nums[i] and nums[j]:**
   - Swap these two elements.

4. **Reverse the subarray after index i:**
   - Reverse the subarray from `i + 1` to the end of the array.

---

### Example
- Input: [1, 2, 3]
- Output: [1, 3, 2]

- Input: [3, 2, 1]
- Output: [1, 2, 3]

---

### Complexity
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)
