package assignments.PiMasterWorker;

/**
 * Approximates PI using the Monte Carlo method.  Demonstrates
 * use of Callables, Futures, and thread pools.
 */
public class Pi 
{
    public static void main(String[] args) throws Exception 
    {
	long total=0;
    //SCALABILITE FORTE ==> NB DE TIRAGES CONSTANTS
        // p=1 total = new Master().doRun(5000000, 1); // 5 000 000 de tirages
        // p=2 total = new Master().doRun(2500000, 2); // 5 000 000 de tirages
        // p=4 total = new Master().doRun(1250000, 4); // 5 000 000 de tirages
        // p=8 total = new Master().doRun(625000, 8); // 5 000 000 de tirages
        // p=16 total = new Master().doRun(312500, 16); // 5 000 000 de tirages
    //SCALABILITE FAIBLE ==> NB DE TIRAGES AUGMENTE AVEC LES WORKERS
        // Premier argument FIXE (charge par worker constante)
        //p=1 total = new Master().doRun(500000, 1);  // 500 000 tirages
        //p=2 total = new Master().doRun(500000, 2);  // 1 000 000 de tirages
        //p=4 total = new Master().doRun(500000, 4);  // 2 000 000 de tirages
        //p=8 total = new Master().doRun(500000, 8);  // 4 000 000 de tirages
	System.out.println("total from Master = " + total);


    }
}





