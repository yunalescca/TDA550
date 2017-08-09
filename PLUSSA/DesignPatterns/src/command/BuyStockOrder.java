package command;

/**
 * Created by Yunalescca on 2017-08-09.
 */

//CONCRETE COMMAND CLASS
public class BuyStockOrder implements Order{

    private StockTrade stockTrade;

    public BuyStockOrder(StockTrade stockTrade){
        this.stockTrade = stockTrade;
    }

    @Override
    public void execute() {
        stockTrade.buy();
    }
}
