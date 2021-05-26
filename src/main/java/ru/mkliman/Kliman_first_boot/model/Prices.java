package ru.mkliman.Kliman_first_boot.model;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    Map<String, String> pr = new HashMap<>();


    public Map<String, String> getPr() {
        return pr;
    }

    public void setPr(Map<String, String> pr) {
        this.pr = pr;
    }
}
