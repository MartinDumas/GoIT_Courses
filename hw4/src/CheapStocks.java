import java.util.Arrays;

public class CheapStocks {
    public String getCheapStocks(String[] stocks){
       String cheapStocks = "";
       for (String stock : stocks) {
           String[] split = stock.split(" ");
           if(Integer.parseInt(split[1])<200){
               cheapStocks+=split[0]+", ";
           }
       }
       return cheapStocks;

    }

    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        String[] stocks = {"fsf 121", "sff 1231"};
        System.out.println(cheapStocks.getCheapStocks(stocks));

    }

}
