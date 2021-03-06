import java.util.Arrays;

public class CountingNegativeNumbers {
    static int countNegativeFixedArray(int[] intArray) {
        int result = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] < 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] fixedArray = {1, 0, -2, 5, 6, -4};
        System.out.println(countNegativeFixedArray(fixedArray));

       Arrays.sort(fixedArray);
       int countNegativeNumber = 0;
        while(countNegativeNumber < fixedArray.length && fixedArray[countNegativeNumber] < 0)
        {
            countNegativeNumber++;                            // increment i
        }
        System.out.println("countNegativeNumber = " + countNegativeNumber);

        int[] fixedArrayLarge = {1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4,1, 0, -2, 5, 6, -4};
        System.out.println("Large array" + countNegativeFixedArray(fixedArrayLarge));

        Arrays.sort(fixedArrayLarge);
        countNegativeNumber = 0;
        while(countNegativeNumber < fixedArrayLarge.length && fixedArrayLarge[countNegativeNumber] < 0)
        {
            countNegativeNumber++;                            // increment i
        }
        System.out.println("countNegativeNumber = " + countNegativeNumber);



    }
}
