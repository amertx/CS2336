public class Q9_2 {

    public static void main(String[] args) {
        // write your code here
        Stock stockObj = new Stock("ORCL", "Oracle Corporation");
        stockObj.setPreviousClosingPrice(34.5);
        stockObj.setCurrentPrice(34.35);
        System.out.print("The price-change percentage is " );
        System.out.printf("%.2f", stockObj.getChangePercent());
        System.out.print("%");
    }

}

class Stock{
    String stockSymbol;
    String stockName;
    double previousClosingPrice;
    double currentPrice;

    Stock(){

    }

    Stock(String newStockSymbol, String newStockName){
        stockSymbol = newStockSymbol;
        stockName = newStockName;
    }

    void setPreviousClosingPrice(double newPreviousClosingPrice){
        previousClosingPrice = newPreviousClosingPrice;
    }

    void setCurrentPrice(double newCurrentPrice){
        currentPrice = newCurrentPrice;
    }

    double getChangePercent(){
        return ((currentPrice-previousClosingPrice)/currentPrice)*100;
    }
}