package com.mycompany.homework6;


public class Worker implements Runnable{
    private Store store;
    private Integer num;

    public Worker(Store store, Integer num) {
        this.store = store;
        this.num = num;
    }
    
    @Override
    public void run(){
        while(true){
            store.print(num);
        }
    }
}
