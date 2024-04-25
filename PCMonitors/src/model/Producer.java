package model;

public class Producer extends Thread {

    private int id;
    private CubbyHole ch;

    public Producer(int id, CubbyHole ch) {
        this.id = id;
        this.ch = ch;
    }

    @Override
    public void run() {
        for (int i = 0; i < Main.MAX; i++) {
            ch.set(getName() + id, i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }

        }
    }
}
