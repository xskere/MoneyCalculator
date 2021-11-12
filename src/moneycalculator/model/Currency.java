package moneycalculator.model;

public class Currency {
    private String currencyIdentificator;
    private String symbol;
    
    public Currency(String line){
        this.currencyIdentificator = line.split(" ")[0];
        this.symbol = line.split(" ")[1];
    }
    
    public String getId(){
        return this.currencyIdentificator;
    }

    public String getSymbol() {
        return this.symbol;
    }

}
