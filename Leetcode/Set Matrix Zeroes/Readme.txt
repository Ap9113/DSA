## Set Matrix Zeroes

### Problem Statement
Given a matrix, if an element is 0, set its entire row and column to 0. Do it in-place if possible.

---

### Brute-Force Approach
1. For each cell in the matrix, if it is 0, mark all cells in its row and column to be set to 0 (using a marker value, e.g., -1).
2. After the first pass, set all marked cells to 0.

**Time Complexity:** O((m + n) * (m * n)) (since each zero may cause a full row and column scan)
**Space Complexity:** O(1) (if using marker value in-place)

---

### Most Optimal Approach (In-Place)
1. First, we will traverse the matrix and mark the proper cells of 1st row and 1st column with 0 accordingly. 
   The marking will be like this: if cell(i, j) contains 0, we will mark the i-th row i.e. matrix[i][0] with 0 and we will mark j-th column i.e. matrix[0][j] with 0. 
   If i is 0, we will mark matrix[0][0] with 0 but if j is 0, we will mark the col0 variable with 0 instead of marking matrix[0][0] again.
2. After step 1 is completed, we will modify the cells from (1,1) to (n-1, m-1) using the values from the 1st row, 1st column, and col0 variable.
   We will not modify the 1st row and 1st column of the matrix here as the modification of the rest of the matrix(i.e. From (1,1) to (n-1, m-1)) is dependent on that row and column.
3. Finally, we will change the 1st row and column using the values from matrix[0][0] and col0 variable. Here also we will change the row first and then the column.
   If matrix[0][0] = 0, we will change all the elements from the cell (0,1) to (0, m-1), to 0.
   If col0 = 0, we will change all the elements from the cell (0,0) to (n-1, 0), to 0.

**Time Complexity:** O(2*m * n)
**Space Complexity:** O(1)
