package model;

public class Consumer extends Thread {

    private int id;
    private CubbyHole ch;

    public Consumer(int id, CubbyHole ch) {
        this.id = id;
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i = 0; i < Main.MAX; i++) {
            ch.get(getName() + id);

        }
    }
}
