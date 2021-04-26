package produttore_e_consumatore_wait_e_notify;

public class Main {

    public static void main(String[] args) {
        BufWaitNot buff = new BufWaitNot();
        
        Produttore p = new Produttore(buff);
        Consumatore c = new Consumatore(buff);
        p.start();
        c.start();
    }
    
}
