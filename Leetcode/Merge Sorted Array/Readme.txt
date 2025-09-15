## Merge Sorted Array Approach

### Steps

1. Start merging from the end of `arr1` to avoid overwriting elements.
2. Use 3 pointers:
	- `i = m - 1` → last valid element in `arr1`
	- `j = n - 1` → last element in `arr2`
	- `k = m + n - 1` → last position in `arr1`
3. Compare `arr1[i]` and `arr2[j]`:
	- Place the larger value at position `k` in `arr1`.
	- Move the pointer (`i` or `j`) back accordingly.
	- Move `k` back in each step.
4. If `arr2` still has elements left (`j >= 0`):
	- Copy them directly into `arr1[0..j]`.
5. No need to copy remaining elements of `arr1` — they're already in place.

**Time Complexity:** O(m + n)  
**Space Complexity:** O(1) – In-place