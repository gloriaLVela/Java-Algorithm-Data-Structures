import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {


    static double getFibonacci(int number, double[] numberArray) {
//        System.out.println("number inside function = " + number);
        if (number <= 0) return 0;
        if (numberArray[number] > 0) {
            System.out.println("numberArray[" + number + "] = " + numberArray[number]);
            return numberArray[number];
        }
        numberArray[number] = getFibonacci(number - 1, numberArray) + getFibonacci(number - 2, numberArray);
        return getFibonacci(number - 1, numberArray) + getFibonacci(number - 2, numberArray);
    }

    public static void main(String[] args) {

        int currentNumber;
        currentNumber = 144;
        double[] data = new double[currentNumber + 1];

//        Arrays.fill(data, new int(0));
        for (int index = 0; index < data.length; index++) {
            data[index] = 0;
        }
        data[1] = 1;
        data[2] = 1;
        System.out.println("currentNumber = " + currentNumber);
        System.out.println(getFibonacci(currentNumber, data));

//        555565404224292694404015791808
        System.out.println("data[currentNumber] = " + data[currentNumber]);

    }
}
