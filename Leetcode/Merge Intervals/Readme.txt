## Merge Intervals

### Problem Statement
Given a collection of intervals, merge all overlapping intervals.

---

### Brute-Force Approach
1. Iterate through each interval and compare it with intervals already in the result list.
2. If the current interval overlaps with any interval in the result, merge them by updating the end value.
3. If it does not overlap, add it as a new interval.

**Time Complexity:** O(n²) (in worst case, each interval compared with all others)
**Space Complexity:** O(n)

---

### Optimal Approach (Sorting)
1. Sort the intervals based on their start value.
2. Iterate through the sorted intervals:
    - If the current interval does not overlap with the last interval in the merged list, add it.
    - If it does overlap, merge by updating the end value of the last interval in the merged list.

**Time Complexity:** O(n log n) (due to sorting)
**Space Complexity:** O(n)