import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Initialize RandomList for S and T
        RandomList S = new RandomList();
        S.generateS(10); // Change this value for different experiments
        RandomList T = new RandomList();
        T.generateT(S, 100000);

        // Get the lists
        int[] SList = S.getList();
        int[] TList = T.getList();

        // Time Algorithm MA
        long totalRuntimeMA = 0;
        
        // Run the algorithm 500 times to get the average runtime for MA
        for (int i = 0; i < 500; i++) {
            long startTime = System.nanoTime();

            // Search for each target in the unsorted array
            for (int target : TList) {
                linearSearch(SList, target);
            }

            long endTime = System.nanoTime();
            totalRuntimeMA += (endTime - startTime);
        }

        // Divides by 500 to get average
        long averageRuntimeMA = totalRuntimeMA / 500;
        System.out.println("Average runtime of Algorithm MA: " + averageRuntimeMA);

        // Time Algorithm MB
        Arrays.sort(SList);
        long totalRuntimeMB = 0;

        // Run the algorithm 500 times to get the average runtime
        for (int i = 0; i < 500; i++) {
            long startTime = System.nanoTime();

            // Search for each target in the sorted array
            for (int target : TList) {
                binarySearch(SList, target);
            }

            long endTime = System.nanoTime();
            totalRuntimeMB += (endTime - startTime);
        }
        
        // Divides by 500 to get average
        long averageRuntimeMB = totalRuntimeMB / 500;
        System.out.println("Average runtime of Algorithm MB: " + averageRuntimeMB);
    }

    // https://www.geeksforgeeks.org/java-program-for-linear-search/
    /*
     * This function searches for a target in an array using linear search.
     * 
     * @param target The target to search
     * @param array The array to search from
     */
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    // https://www.geeksforgeeks.org/binary-search/
    /*
     * This function searches for a target in an array using binary search.
     * 
     * @param target The target to search
     * @param array The array to search from
     */
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
