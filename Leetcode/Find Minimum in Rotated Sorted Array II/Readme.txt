## Find Minimum in Rotated Sorted Array II

### Problem Statement
Given a rotated sorted array that may contain duplicates, find the minimum element.

---

### Brute-Force Approach
1. Iterate through the array and track the minimum value found.
2. Return the minimum value.

**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

### Optimal Approach (Modified Binary Search)
1. If the first element is less than the last, the array is not rotated; return the first element.
2. Use binary search:
    - If `arr[mid] == arr[high]`, decrement `high` to skip duplicates.
    - If `arr[mid] < arr[high]`, the minimum is in the left half (including mid).
    - Otherwise, the minimum is in the right half (excluding mid).
3. Continue until `low` equals `high`. Return `arr[low]`.

**Time Complexity:** O(log n) (average), O(n) (worst case with many duplicates)
**Space Complexity:** O(1)

---