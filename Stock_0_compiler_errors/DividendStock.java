// Represents a stock purchase that also pays dividends.
public class DividendStock extends Stock {
    private double dividends;   // amount of dividends paid

    // Constructs a new dividend stock with the given symbol
    // and no shares purchased.
    public DividendStock(String theSymbol) {
        super(theSymbol);  // call Stock constructor
        dividends = 0.0;  // this is the new code
    }

    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice) + this.dividends;
    }

    // Records a dividend of the given amount per share.
    public void payDividend(double amountPerShare) {
        this.dividends += amountPerShare * getTotalShares();
    }
}