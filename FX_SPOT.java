package ru.sberbank;

public class FX_SPOT {
    static Double value;
    public FX_SPOT(Double value) {
        this.value = value;
        System.out.println("FX_SPOT" + " " + value);
    }
}
