package com.mycompany.homework6;


public class Homework6 {

    public static void main(String[] args) {
       Store store = new Store();
       new Thread (new Worker(store,0)).start();
       new Thread (new Worker(store,1)).start();
       new Thread (new Worker(store,2)).start();
       new Thread (new Worker(store,3)).start();
    }
}
