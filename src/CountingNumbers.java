import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CountingNumbers {
    public static  HashMap<Integer, Integer> countingItems(int[] intArray){
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int counter;
        for(int i = 0; i < intArray.length; i++){
            if (hmap.containsKey(intArray[i])){
                counter = hmap.get(intArray[i]);
                counter ++;
              hmap.put(intArray[i],counter );

            }else {
                hmap.put(intArray[i],1);
            }
        }

        return hmap;
    }

    public static void main(String[] args) {
        int[] fixedArray = {1,0,1,2,3,4,5,12,3,4,5,8,9,2,1,3,4,6,7,8,9};
        System.out.println("Arrays.toString(fixedArray) = " + Arrays.toString(fixedArray));

        HashMap<Integer, Integer> hmap = countingItems(fixedArray);
        for (Integer key: hmap.keySet()){
            System.out.println("key = " + key);
            System.out.println("hmap.get(" + key + ") = " + hmap.get(key));
        }
    }
}
