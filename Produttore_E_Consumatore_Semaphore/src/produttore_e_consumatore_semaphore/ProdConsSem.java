package produttore_e_consumatore_semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class ProdConsSem {

    private static Semaphore semaforoVuoto = new Semaphore(1);
    private static Semaphore semaforoPieno = new Semaphore(0);
    private static int buffer = 0;

    static class Produttore extends Thread {
        public void run(){
            while (true) {                
                
                try {
                    semaforoVuoto.acquire();
                    buffer++;
                    System.out.println("Produce: " + buffer);
                    semaforoPieno.release();
                } catch (Exception e) {
                }
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (Exception e) {
                }
            }
        }
    }

    static class Consumatore extends Thread {

        int j = 0;

        public void run() {
            while (true) {
                try {
                    semaforoPieno.acquire();
                    j = buffer;
                    System.out.println("Consuma " + j);
                    semaforoVuoto.release();
                } catch (Exception e) {
                }
            }
        }
    }
}
