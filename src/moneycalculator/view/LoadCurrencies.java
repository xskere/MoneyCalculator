package moneycalculator.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.net.URL;
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
    
    public static float exchangeRate(String from, String to){
        String api = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/"
                        + "latest/currencies/" + from + "/" + to + ".json";
        try{
            URL xd = new URL(api);
            InputStream is = xd.openStream();
            byte[] buffer = new byte [1024];
            int length = is.read(buffer,30,30);
            length = is.read(buffer,30,30);
            String aux = new String(buffer,0,1024);
            return Float.parseFloat(aux.substring(aux.indexOf(":")+1, aux.indexOf("}")));
        } catch (Exception e){
            System.out.println(e);}
        return 1;
    }
}


