package model; 

public class CubbyHole {

    private int content;
    private boolean algoParaConsumir = false;

    public synchronized void set(String producer, int value) {

        if (algoParaConsumir) {
            try {
                this.wait();
                System.out.println("...");
            } catch (InterruptedException e) {}
        }

        System.out.printf("\nProdutor %s produziu %d\n", producer, value);

        content = value;
        
        notify();
        algoParaConsumir = true;
    }

    public synchronized int get(String consumer) {

        if (!algoParaConsumir) {
            try {
                this.wait();
            } catch (InterruptedException e) {}
        }

        System.out.printf("\nConsumidor %s consumiu %d\n", consumer, content);

        algoParaConsumir = false;
        
        notify();
        return content;
    }
}
