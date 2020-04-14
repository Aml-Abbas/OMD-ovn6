package upp3;

import java.util.LinkedList;
import java.util.List;

public class Portfolio extends Observable {
    private List<Stock> stocks;
    private double buyValue;
    private double yieldLimit;

    public Portfolio(double yieldLimit) {
        this.yieldLimit = yieldLimit;
        this.stocks = new LinkedList<>();
    }

    public void add(Stock stock) {
        stocks.add(stock);
        buyValue += stock.value();
        stock.addObserver((obs, obj) -> {
            check();
        });
    }

    public double currentYield() {
        double value = stocks
                .stream()
                .mapToDouble(s -> s.value())
                .sum();
        return value / buyValue;
    }

    private void check() {
        if (currentYield() < yieldLimit) {
            setChanged();
            notifyObservers();
        }
    }
}
