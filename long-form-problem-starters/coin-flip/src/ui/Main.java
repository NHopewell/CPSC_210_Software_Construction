package ui;

import model.Coin;

public class Main {
    public static void main(String[] args) {

        Coin newCoin = new Coin();
        System.out.println(newCoin.checkStatus());
        newCoin.flip();
        System.out.println(newCoin.checkStatus());
        newCoin.flip();
        System.out.println(newCoin.checkStatus());
        newCoin.flip();
        System.out.println(newCoin.checkStatus());
        newCoin.flip();
    };

}
