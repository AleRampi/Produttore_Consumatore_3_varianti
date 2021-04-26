package produttore_e_consumatore_wait_e_notify;

public class Produttore extends Thread{
    private BufWaitNot b;
    
    private int numero = 0;
    
    public Produttore(BufWaitNot buf){
        b = buf;
    }
    
    public void run(){
        for(int i = 0; i < 5; i++){
            numero = (int) (Math.random() * 50);
            b.deposita(numero);
            try {
                sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
            }
        }
        
    }
}
