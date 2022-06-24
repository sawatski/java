package lab8;

public class Main {

    public static void main(String[] args) {
        long iterations = 1000000000;
        int threads = 4;
        ParallelMonteCarloPi parallelPi = new ParallelMonteCarloPi(threads, iterations);
        long startTime = System.currentTimeMillis();
        double pi = parallelPi.getResult();
        long endTime = System.currentTimeMillis();
        long executingTime = endTime - startTime;
        System.out.println("PI is " + pi + "\n" +
                "THREADS " + threads + "\n" +
                "ITERATIONS " + iterations + "\n" +
                "TIME " + executingTime
        );
    }
}
