package model;

public class Main {

    public static final int MAX = 1000000;

    public static void main(String[] args) {

        CubbyHole cb = new CubbyHole();

        Producer p = new Producer(1, cb);
        p.setName("Produtor");

        Consumer c = new Consumer(1, cb);
        c.setName("Consumidor");

        p.start();
        c.start();
    }
}
