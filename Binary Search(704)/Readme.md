💡 Idea:

This solution uses Linear Search to find the target element.
It checks each element one by one from left to right.

⚙️ Approach:
Initialize idx = -1 (default if target is not found)
Traverse the array using a loop
If nums[i] == target, store the index in idx
Continue checking the rest of the array
Return idx at the end

👉 Note: Since there is no break statement, the loop continues even after finding the target.
So, it will return the last occurrence if duplicates exist.

🧪 Dry Run 1
Input:
nums = [-1,0,3,5,9,12]
target = 9
Steps:
i=0 → -1 ≠ 9 → skip
i=1 → 0 ≠ 9 → skip
i=2 → 3 ≠ 9 → skip
i=3 → 5 ≠ 9 → skip
i=4 → 9 == 9 → idx = 4
i=5 → 12 ≠ 9 → skip
Output:
4
🧪 Dry Run 2 (Target Not Found)
Input:
nums = [1,2,3,4,5]
target = 10
Steps:
i=0 → 1 ≠ 10
i=1 → 2 ≠ 10
i=2 → 3 ≠ 10
i=3 → 4 ≠ 10
i=4 → 5 ≠ 10
Output:
-1
🧪 Dry Run 3 (Duplicate Elements)
Input:
nums = [2,4,6,4,8]
target = 4
Steps:
i=0 → 2 ≠ 4
i=1 → 4 == 4 → idx = 1
i=2 → 6 ≠ 4
i=3 → 4 == 4 → idx = 3 (updated)
i=4 → 8 ≠ 4
Output:
3   (last occurrence)
⚠️ Edge Cases:
Empty array → returns -1
Target not present → returns -1
Duplicate elements → returns last index
Single element array → works correctly
⏱ Complexity:
Time Complexity: O(n)
Space Complexity: O(1)
🚀 Important Note:
This problem is designed for Binary Search (O(log n))
Your solution uses Linear Search (O(n))
✔ Works correctly
❌ Not optimal for large inputs
