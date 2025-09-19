## Rotate Image

### Problem Statement
Given an n x n 2D matrix, rotate the matrix by 90 degrees (clockwise) in-place.

---

### Brute-Force Approach
1. Create a new matrix of the same size.
2. For each element in the original matrix, place it in its rotated position in the new matrix: `rotated[j][n - 1 - i] = matrix[i][j]`.
3. Copy the rotated matrix back to the original matrix.

**Time Complexity:** O(n²)
**Space Complexity:** O(n²)

---

### Optimal Approach (Transpose + Reverse)
1. Transpose the matrix (swap `matrix[i][j]` with `matrix[j][i]`).
2. Reverse each row of the transposed matrix.
3. This rotates the matrix in-place without extra space.

**Time Complexity:** O(n²)
**Space Complexity:** O(1)
