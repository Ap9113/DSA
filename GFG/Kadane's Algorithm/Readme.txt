## Kadane's Algorithm Approaches

### Brute Force Approach

- Try every possible subarray using three nested loops:
	- Outer loop: starting index
	- Middle loop: ending index
	- Inner loop: sum from start to end
- Track the maximum sum found.

**Time Complexity:** O(n³)  
**Space Complexity:** O(1)

---

### Better Approach (Prefix Sum)

- Avoid recomputing sums with a third loop.
- Keep a running sum as you expand the subarray.
- For each starting index, iterate the end index and maintain the current sum.

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

---

### Optimal Approach – Kadane’s Algorithm

**Initialize:**
- `maxSum = Integer.MIN_VALUE` (or `nums[0]`)
- `currentSum = 0`

**Iterate through the array:**
- Add current element to `currentSum`
- If `currentSum > maxSum`, update `maxSum`
- If `currentSum < 0`, reset `currentSum = 0`

**Time Complexity:** O(n)  
**Space Complexity:** O(1)