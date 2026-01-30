// Estimate the value of Pi using Monte-Carlo Method, using parallel program
package assignments.PiMonteCarlo;

public class Assignment102 {
	public static void main(String[] args) {
		PiMonteCarlo PiVal = new PiMonteCarlo(100000);
		long startTime = System.currentTimeMillis();
		double value = PiVal.getPi();
		long stopTime = System.currentTimeMillis();
        System.out.println("\nPi : " + value);
        System.out.println("Error: " + (Math.abs((value - Math.PI)) / Math.PI) + "\n");

        System.out.println("Ntot: " + PiVal.nThrows);
        System.out.println("Available processors: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Time Duration (ms): " + (stopTime - startTime) + "\n");

        System.out.println((Math.abs((value - Math.PI)) / Math.PI) + " " + PiVal.nThrows + " " + Runtime.getRuntime().availableProcessors() + " " + (stopTime - startTime));
	}
}