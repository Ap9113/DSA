## Longest Consecutive Sequence

### Problem Statement
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

---

### Brute-Force Approach
1. For each element, check if the next consecutive number exists in the array.
2. Use a loop to keep checking for the next number and count the length of the sequence.
3. Repeat for every element.

**Time Complexity:** O(n^2) (for each element, search for next consecutive)
**Space Complexity:** O(1)

---

### Better Approach (Sorting)
1. Sort the array.
2. Iterate through the sorted array and count the length of consecutive sequences.
3. Skip duplicates.

**Time Complexity:** O(n log n) (due to sorting)
**Space Complexity:** O(1) (if sorting in-place)

---

### Optimal Approach (Using HashSet)
1. Insert all elements into a HashSet for O(1) lookups.
2. For each element, check if it is the start of a sequence (i.e., `num - 1` is not in the set).
3. If it is, keep checking for `num + 1`, `num + 2`, ... and count the length.
4. Track the maximum length found.

**Time Complexity:** O(n) (each number is processed at most twice)
**Space Complexity:** O(n) (for the HashSet)
