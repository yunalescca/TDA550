package command;

/**
 * Created by Yunalescca on 2017-08-09.
 */

//EXAMPLE IS FROM THE LECTURE SLIDES
public class Main {

    public static void main(String[] args) {
        StockTrade stockTrade = new StockTrade();
        Agent agent = new Agent();

        BuyStockOrder buyStockOrder = new BuyStockOrder(stockTrade);
        SellStockOrder sellStockOrder = new SellStockOrder(stockTrade);

        agent.placeOrder(buyStockOrder);
        agent.placeOrder(sellStockOrder);

    }

}
