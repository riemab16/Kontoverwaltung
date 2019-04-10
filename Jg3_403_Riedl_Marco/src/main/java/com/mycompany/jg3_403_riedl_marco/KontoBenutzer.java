package com.mycompany.jg3_403_riedl_marco;

public class KontoBenutzer implements Runnable{
    private String name;

    public KontoBenutzer(String name) {
        this.name = name;
    }
    
    
    @Override
    public void run() {
        
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
