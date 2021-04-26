package produttore_e_consumatore_wait_e_notify;

public class BufWaitNot {

    private static int valore;
    private boolean pieno = false;

    public synchronized int preleva() {
        while (pieno == false) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        pieno = false;
        notify();
        System.out.println("Consuma il numero: " + valore);
        return valore;
    }
    
    public synchronized void deposita(int value){
        while(pieno == true){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        pieno = true;
        valore = value;
        notify();
        System.out.println("Produce il numero: " + valore);
    }
}

