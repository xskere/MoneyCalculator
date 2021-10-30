package moneycalculator.persistence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import moneycalculator.model.Currency;

public class LoadCurrencies {
    
    public static List<Currency> loadCurrencies(String fileName){
        List<Currency> list = new ArrayList<Currency>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line=br.readLine())!=null){
                Currency toAdd = new Currency(line);
                list.add(toAdd);
            }
        }catch (IOException e){}
        return list;
    }
}


