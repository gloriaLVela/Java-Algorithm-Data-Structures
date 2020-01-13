import java.util.Arrays;

public class CoinChange {
    static int minCoins(int amount, int[] coinArray) {
        int result;
        int minCoins = amount;
        if (amount <= 0) {
            return 0;
        }
        if (coinArray[amount] > 0) {
            return coinArray[amount];
        }

        int i=1;
        while((amount - i) > 0){
            result = minCoins(amount - i, coinArray) +  minCoins(i, coinArray);
            if (result < minCoins) {
                minCoins = result;
            }
            i++;
        }
        coinArray[amount] = minCoins;
        return minCoins;
    }

    static int calculateCoin(int amount, int[] coins) {
        int[] coinArray;

      if(  java.util.Arrays.asList(coins).indexOf(amount) >0 ) {
          return 1;
      }
        if (amount > coins[coins.length - 1] + 1) {
            coinArray = new int[amount + 1];
        } else {
            coinArray = new int[coins[coins.length - 1] + 1];
        }

        for (int index = 0; index < coinArray.length; index++) {
            coinArray[index] = 0;
        }

        for (int i = 0; i < coins.length; i++) {
            coinArray[coins[i]] = 1;
        }
//        System.out.println(Arrays.toString(coinArray));
        return minCoins(amount, coinArray);
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        System.out.println(Arrays.toString(coins));
        System.out.println(5 + ", " + calculateCoin(5, coins));
        System.out.println(9 + ", " + calculateCoin(9, coins));
        System.out.println(25 + ", " + calculateCoin(25, coins));
        System.out.println(1 + ", " + calculateCoin(1, coins));
        System.out.println(13 + ", " + calculateCoin(13, coins));

    }
}
