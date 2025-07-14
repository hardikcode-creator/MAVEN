package org.withoutXML2;

import org.springframework.beans.factory.annotation.Value;

public class Samosa {

    @Value("#{12}")
    private int price;
    public void display(){
        System.out.println("This is a samosa");
    }

    @Override
    public String toString() {
        return "Samosa{"+"price:"+price+"}";
    }
}
