## Set Matrix Zeroes

### Problem Statement
Given a matrix, if an element is 0, set its entire row and column to 0. Do it in-place if possible.

---

### Brute-Force Approach
1. For each cell in the matrix, if it is 0, mark all cells in its row and column to be set to 0 (using a marker value, e.g., -1).
2. After the first pass, set all marked cells to 0.

**Time Complexity:** O((m + n) * m * n) (since each zero may cause a full row and column scan)
**Space Complexity:** O(1) (if using marker value in-place)

---

### Most Optimal Approach (In-Place)
1. Use the first row and first column of the matrix itself to store zero markers for other rows and columns.
2. Use separate flags to track if the first row or first column should be zeroed.
3. First pass: Mark zeros in the first row/column.
4. Second pass: Set cells to 0 based on markers.
5. Finally, zero the first row/column if needed.

**Time Complexity:** O(m * n)
**Space Complexity:** O(1)
