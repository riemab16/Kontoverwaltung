
package com.mycompany.jg3_403_riedl_marco;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

public class KontoModel extends AbstractListModel{

    private int kontostand;
    private ArrayList<KontoBenutzer> accounts = new ArrayList<>();
    
    @Override
    public int getSize() {
        return accounts.size();
    }

    @Override
    public Object getElementAt(int i) {
        return accounts.get(i);
    }
    
    public void add(KontoBenutzer k){
        accounts.add(k);
        fireIntervalAdded(this, accounts.size()-1, accounts.size()-1);
    }
    public synchronized int removeMoney(int money) throws InterruptedException{
        while(money > kontostand){
            wait();
        }
        this.kontostand = money;
        return kontostand;
    }
    
    public synchronized int addMoney(int money){
        this.kontostand += money;
        return kontostand;
    }
    
}
