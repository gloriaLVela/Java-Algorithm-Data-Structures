public class PrefixSums {
    // Fills prefix sum array
    static void fillPrefixSum(int arr[],
                              int prefixSum[]) {
        prefixSum[0] = arr[0];
        // Adding present element
        // with previous element
        for (int i = 1; i < arr.length; ++i)
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        return;
    }

    public static int calSum(int[] prefix, int left, int right) {
        return prefix[right] - prefix[left];
    }

    static int pickMushrooms(int arrayList[], int start, int totalMoves) {
        int result = 0;
        int currentMax = 0;
        int n = arrayList.length;
        int prefixSum[] = new int[n];
        int startMax = 0;
        int endMax = 0;
        fillPrefixSum(arrayList, prefixSum);

        for (int i = 0; i < Math.min(totalMoves, start); i++) {
            int left = start - i;
            int right = Math.min(n - 1, Math.max(start, start + totalMoves - 2 * i));
            result = Math.max(result, calSum(prefixSum, left, right));
            if (currentMax <= result) {
                currentMax = result;
                startMax = left;
                endMax = right;
            }
        }
        for (int i = 0; i < Math.min(arrayList.length - start, totalMoves + 1); i++) {
            int right = start + i;
            int left = Math.max(0, Math.min(start, start - (totalMoves - 2 * i)));
            result = Math.max(result, calSum(prefixSum, left, right));
            if (currentMax <= result) {
                currentMax = result;
                startMax = left;
                endMax = right;
            }
        }
        result = 0;
//        System.out.println("startMax = " + startMax);
//        System.out.println("endMax = " + endMax);
        for (int i = startMax; i <= endMax; i++) {
            result += arrayList[i];
//            System.out.println("result = " + result);
        }

        return result;

    }
    public static void main(String[] args) {
        /*********************************
         * prefix of sums
         **********************************/

        //

        int arr[] = {2, 3, 7, 5, 1, 3, 9};
        int totalMoves = 6;
        int startLocation = 4;
        System.out.print("Total mushrooms " + pickMushrooms(arr, startLocation, totalMoves));

    }
}
