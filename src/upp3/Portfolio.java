package upp3;

import java.util.LinkedList;
import java.util.List;

public class Portfolio extends Observable {
    private List<Stock> stocks;
    private double buyValue;
    private double yieldLimit;

    public Portfolio(double yieldLimit) {
        this.yieldLimit = yieldLimit;
        this.buyValue=0;
        this.stocks = new LinkedList<>();
    }

    public void add(Stock stock) {
        stocks.add(stock);
        buyValue += stock.value();
            if (currentYield() < yieldLimit) {
                setChanged();
                notifyObservers(buyValue);
            }
    }

    public double currentYield() {
        double value = stocks
                .stream()
                .mapToDouble(s -> s.value())
                .sum();
        return value / buyValue;
    }
}
