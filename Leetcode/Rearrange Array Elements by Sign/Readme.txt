## Rearrange Array Elements by Sign

### Brute-Force Approach

- Create two separate lists: one for positives, one for negatives.
- Place positives at even indices, negatives at odd indices in a new array.

**Time Complexity:** O(n)  
**Space Complexity:** O(n) (for two extra lists)

---

### Optimal Approach (In-place, Two-Pass)

- Traverse the array once to get the correct elements into their desired positions.
- Use a result array (still O(n) space).
- Maintain two pointers:
	- One for even indices (positives)
	- One for odd indices (negatives)

**Time Complexity:** O(n)  
**Space Complexity:** O(n) (for result array only)