public class DiverseArray {
    static int arraySum(int[] arr) {
        int sum = 0;
        for (int el: arr)
            sum += el;
        return sum;
    }

    static int[] rowSums(int[][] arr) {
        int[] rowSums = new int[arr.length];
        int i = 0;
        for (int[] row : arr) {
            rowSums[i++] = arraySum(row);
        }
        return rowSums;
    }

    static boolean isDiverse(int[][] arr) {
        int[] rowSums = rowSums(arr);
        for (int i = 0; i < rowSums.length; ++i) {
            for (int j = i+1; j < rowSums.length; ++j) {
                if (rowSums[i] == rowSums[j]) return false;
            }
        }
        return true;
    }
}
