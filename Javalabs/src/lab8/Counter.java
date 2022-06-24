package lab8;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public synchronized void count(int increment) {
        counter += increment;
    }

    public int getCounter() {
        return counter;
    }
}
