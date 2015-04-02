package com.bko.adapter;

/**
 * Created by yo on 4/3/15.
 */
public class Hanako implements Chairperson {
    private Taro taro;

    public Hanako() {
        this.taro = new Taro();
    }

    @Override
    public void organaizeClass() {
        this.taro.enjoyWithClassmate();
    }
}
