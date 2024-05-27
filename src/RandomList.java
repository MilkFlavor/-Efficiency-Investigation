import java.util.Random;

public class RandomList {
    
    private int[] list;

    /*
     * Generate a list of n random even numbers from 0 to 200
     * 
     * @param n the number of elements in the list
     */
    public void generateS(int n) {
        list = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list[i] = 2 * rand.nextInt(101); // even numbers from 0 to 200
        }
    }

    /*
     * This function generates a random list for T with positive int from 1 to 201
     * The even number numbers from S are copied to T, and the odd numbers are generated randomly
     * 
     * @param S the list of even numbers
     */
    public void generateT(RandomList S, int n) {
        list = new int[n];
        Random rand = new Random();
        int[] SList = S.getList();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                list[i] = SList[rand.nextInt(SList.length)];
            } else {
                list[i] = 2 * rand.nextInt(101) + 1; // odd numbers from 1 to 201
            }
        }
    }

    /*
     * Getter for the list
     * 
     * @return the list
     */
    public int[] getList() {
        return list;
    }
}