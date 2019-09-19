package ru.sberbank;

import java.io.BufferedReader;
import java.io.IOException;

public class Analyzer {
    public static void analysis(BufferedReader stream) throws IOException {
        String[] str = new String[7];
        String typeOfTrade;
        String price;
        for (int i = 0; i < 7; i++) {
            str[i] = stream.readLine();
        }
        typeOfTrade = str[2];
        price = str[4];
        String tot = "nothing";
        tot = typeOfTrade.split("=")[1];
        price = price.split("=")[1];
        Double pr = Double.parseDouble(price);
        System.out.println(tot);
        switch (tot) {
            case "BOND":
                BOND bond = new BOND(pr);
                break;
            case "COMMODITY_SPOT":
                COMMODITY_SPOT cs = new COMMODITY_SPOT(pr);
                break;
            case "FX_SPOT":
                FX_SPOT fx = new FX_SPOT(pr);
                break;
            case "IR_SWAP":
                IR_SWAP ir_swap = new IR_SWAP(pr);
                break;
            default:
                System.out.println("Хз что за херня, братишка, но не робит");
        }
    }
}
