// A Stock object represents purchases of shares of a stock.
public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;
    
    public Stock(String theSymbol, int totalShares, double totalCost) {
        symbol = theSymbol;
        this.totalShares = totalShares;
        this.totalCost = totalCost;
    }
    
    // Initializes a new Stock with no shares purchased.
    public Stock(String theSymbol) {
        this(theSymbol, 0, 0.0); 
    }
    
    public Stock() {
        this("");
    }

    // Returns the total profit or loss earned on this stock.
    public double getProfit(double currentPrice) {
        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    // Records purchase of the given shares at the given price.
    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        totalCost += shares * pricePerShare;
    }
    
    // Returns the total shares purchased of this stock.
    public int getTotalShares() {
        return totalShares;
    }
}
