package com.example.am.kawiarnia;

/**
 * Created by am on 16.01.2018.
 */

public class Coffe {

        public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public Coffe(String name, String price) {
        Name = name;
        Price = price;

    }

    public String Price;

}
