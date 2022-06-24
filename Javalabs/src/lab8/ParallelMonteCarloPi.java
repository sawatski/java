package lab8;

import java.util.ArrayList;

public class ParallelMonteCarloPi {
    private final int threadNumber;
    private final long iterations;
   
    public ParallelMonteCarloPi(int threadNumber, long iterations) {
        this.threadNumber = threadNumber;
        this.iterations = iterations;
    }

    public double getResult() {
        long iterationsOnThread = iterations / threadNumber;
        Counter counter = new Counter();

        ArrayList<MonteCarloThread> threads = new ArrayList<>();
        for (int i = 0; i < threadNumber; i++) {
            MonteCarloThread thread = new MonteCarloThread(iterationsOnThread, counter);
            threads.add(thread);
            thread.start();
        }

        try {
            for(Thread thread: threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int pointsInCircle = counter.getCounter();
        System.out.println("pointsInCircle: " + pointsInCircle);
        return ((double) pointsInCircle / iterations) * 4.0;
    }
}
