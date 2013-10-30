/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockquotetest;

/**
 *
 * @author Steve
 */
public class StockQuoteTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String stockSymbol = "MMM";
        System.out.println(getQuote(stockSymbol));
    }

    private static String getQuote(java.lang.String symbol) {
        net.webservicex.StockQuote service = new net.webservicex.StockQuote();
        net.webservicex.StockQuoteSoap port = service.getStockQuoteSoap();
        return port.getQuote(symbol);
    }
    
}
