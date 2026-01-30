package assignments.PiMasterWorker;

import java.util.Random;
import java.util.concurrent.Callable;

class Worker implements Callable<Long>
        /**
         * Creates workers to run the Monte Carlo simulation
         * and aggregates the results.
         */
        /**
         * Task for running the Monte Carlo simulation.
         */


{
    private int numIterations;
    public Worker(int num)
    {
        this.numIterations = num;
    }

    @Override
    public Long call()
    {
        long circleCount = 0;
        Random prng = new Random ();
        for (int j = 0; j < numIterations; j++)
        {
            double x = prng.nextDouble();
            double y = prng.nextDouble();
            if ((x * x + y * y) < 1)  ++circleCount;
        }
        return circleCount;
    }
}