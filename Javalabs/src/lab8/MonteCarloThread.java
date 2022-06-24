package lab8;

import java.util.Random;

public class MonteCarloThread extends Thread{
    private final long iterations;
    private final Counter counter;

    public MonteCarloThread(long iterations, Counter pointsInCircleCounter) {
        this.iterations = iterations;
        this.counter = pointsInCircleCounter;
    }

    public void run() {
        Random random = new Random();
        int pointsInCircle = 0;
        for(int i = 0; i < iterations; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            if((Math.pow(x, 2) + Math.pow(y, 2)) < 1) pointsInCircle++;
        }
        counter.count(pointsInCircle);
    }
}
