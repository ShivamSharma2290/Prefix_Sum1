public class RangeSumQuery {
    
    public static int[] preprocessPrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0) {
            return prefix[R];
        }
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        // Input
        int N = 6;
        int[] arr = {3, 1, 4, 1, 5, 9};  
        int Q = 3;
        int[][] queries = {{2, 1}, {0, 2}, {2, 5}};

        // Preprocess prefix sum
        int[] prefix = preprocessPrefixSum(arr);

        for (int[] query : queries) {
            int L = query[0], R = query[1];
            System.out.println(rangeSum(prefix, L, R));
        }
    }
}