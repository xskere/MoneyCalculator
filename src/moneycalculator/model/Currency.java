package moneycalculator.model;

public class Currency {
    private float exchangeRate;
    private String currencyIdentificator;
    
    public Currency(String line){
        this.currencyIdentificator = line.split(" ")[0];
        this.exchangeRate = Float.parseFloat(line.split(" ")[1]);
    }
    
    public String getId(){
        return this.currencyIdentificator;
    }
    
    public float getRate(){
        return this.exchangeRate;
    }

}
