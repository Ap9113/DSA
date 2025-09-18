## Spiral Matrix

### Problem Statement
Given a 2D matrix, return all elements of the matrix in spiral order.

---

### Approach
1. Use four pointers (`top`, `bottom`, `left`, `right`) to define the current layer.
2. Traverse from left to right, top to bottom, right to left, and bottom to top in each layer.
3. Move the pointers inward after each traversal.
4. Continue until all elements are added to the result list.

**Time Complexity:** O(m * n)
**Space Complexity:** O(1) (excluding output list)
