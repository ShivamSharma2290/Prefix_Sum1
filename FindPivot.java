class FindPivot {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        for (int i = 0; i < nums.length; i++) {
            // If left sum equals right sum (right sum = totalSum - leftSum - nums[i])
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            // Update left sum
            leftSum += nums[i];
        }
        
        // If no pivot index is found, return -1
        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        FindPivot findPivot = new FindPivot();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivot.pivotIndex(nums);
        System.out.println("Pivot Index: " + pivotIndex);
    }
}

