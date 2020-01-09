import java.util.Arrays;

public class ReverseArray {
    static int[] reverseThisArray(int[] currentArray) {
        int tempNumber;
        for (int i = 0; i < currentArray.length / 2; i++) {
            tempNumber = currentArray[i];
            currentArray[i] = currentArray[currentArray.length - (1 + i)];
            currentArray[currentArray.length - (1 + i)] = tempNumber;
        }
        return currentArray;
    }


    public static void main(String[] args) {
        int[] fixedArray = {1, 0, -2, 5, 6, -4};
        System.out.println("fixedArray = " + Arrays.toString(fixedArray));
        reverseThisArray(fixedArray);
        System.out.println("fixedArray = " + Arrays.toString(fixedArray));
    }
}
