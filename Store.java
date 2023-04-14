package com.mycompany.homework6;


public class Store {
    private int count;
    
    public synchronized void print(Integer num){
        while(count != num){
            try{
                wait();
            }catch(InterruptedException ex){
                throw new RuntimeException();
            }
        }
        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            
        }
        System.out.println("Thread" + num);
        count = (count + 1 )%4;
        notifyAll();
    }
}
