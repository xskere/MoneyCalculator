package moneycalculator.control;


import moneycalculator.gui.ExchangeWindow;
import static moneycalculator.persistence.LoadCurrencies.loadCurrencies;


public class MoneyCalculator {

    public static void main(String[] args) {
        ExchangeWindow gui = new ExchangeWindow();
        gui.setVisible(true);
        
    }

}
