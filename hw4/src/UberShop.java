import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }
    public void multiplyPrices(float[] prices){
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<1000){
                prices[i] *= 2;
            }else prices[i] *= 1.5f;
        }
    }
    public int[] findMinMaxPrices(int[] prices) {
        if (prices.length == 0) {
            return new int[0];
        }

        int min = prices[0];
        int max = prices[0];

        for(int price: prices) {
            if (price > max) {
                max = price;
            }

            if (price < min) {
                min = price;
            }
        }

        if (min == max) {
            return new int[] {min};
        }

        return new int[] {min, max};
    }
    public int getMinPriceCount(int[] prices){
        if (prices.length == 0) {
            return 0;
        }
        int count = 0;
        int min = prices[0];
        for(int price: prices) {
            if (price < min ) {
                min = price;
                count=1;
            } else if (price == min) {
                count++;
            }
        }
        return count;

    }
    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for(int price: prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }
    public int[] leavePrice9(int[] prices){
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == 9 || prices[i]%10 ==9 ||prices[i]%100 ==9) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for(int price: prices) {
            if (price == 9 || price %10 ==9 ||price %100 ==9) {
                result[index++] = price;
            }
        }

        return result;
    }
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        String[] result = new String[showcaseStocks.length+warehouseStocks.length];
        int index = 0;
        for (String showcase: showcaseStocks) {
            result[index++] = showcase;

        }
       int index1 =showcaseStocks.length;
        for(String warehouse: warehouseStocks) {
            result[index1++] = warehouse;
        }

        return result;
    }
    public int getPricesSum(int[] prices, int minPrice, int maxPrice){
        int sum = 0;
        for (int price: prices) {
            if (price >= minPrice && price <= maxPrice) {
                sum += price;
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

////        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
////        float[] prices = new float[] {100f, 23.5f, 400f};
//        shop.printPrices(prices);
//        shop.multiplyPrices(prices);
//        System.out.println(Arrays.toString(prices));
//        int[] prices = new int[] {5, 5, 5, 5, 10, 10, 5};
//        System.out.println(shop.getMinPriceCount(prices));
//        int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
//        System.out.println(Arrays.toString(shop.leavePrice9(prices)));
        String[] showcaseStocks = new String[] {"gun", "firebow"};
        String[] warehouseStocks = new String[] {"firegun"};
        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

    }
}