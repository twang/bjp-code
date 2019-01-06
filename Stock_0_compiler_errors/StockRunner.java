public class StockRunner
{
    public static void main(String[] args) {
        Stock s = new Stock("a");
        Stock t = new Stock("b", 1, 1.0);
        Stock u = new Stock();
        
        s.purchase(2, 1.0);
        System.out.println(s.getProfit(3.0));
    }
}