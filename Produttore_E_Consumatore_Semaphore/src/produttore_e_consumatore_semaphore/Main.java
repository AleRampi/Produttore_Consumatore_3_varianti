package produttore_e_consumatore_semaphore;

public class Main {

    public static void main(String[] args) {
        
        ProdConsSem.Produttore p = new ProdConsSem.Produttore();        
        ProdConsSem.Consumatore c = new ProdConsSem.Consumatore();
        
        p.start();
        c.start();
    }
}
