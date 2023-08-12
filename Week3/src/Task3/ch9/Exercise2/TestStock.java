package Task3.ch9.Exercise2;

/*
UML class Diagram of class Stock
--------------------------------------------------
-                   Stock                       -
--------------------------------------------------
-    -symbol: String                            -
-    -name: String                              -
-    -previousClosingPrice: double              -
-    -currentPrice: double                      -
-------------------------------------------------
-    +Stock(symbol: String,name: String)        -
-    +getChangePercent(): double                -
-------------------------------------------------
*/
public class TestStock {
    public static void main(String[] args) {

        //create object
        Stock stock = new Stock("ORCL","Oracle Corporation");

        //set previous closing price and current price
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        //print percentage
        System.out.println("the price change percentage is:"+stock.getChangePercent());
    }
}
