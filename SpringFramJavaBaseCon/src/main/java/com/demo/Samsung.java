package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile {
    public void company(){
        System.out.println(" My mobile is Samsung..");
    }
}
