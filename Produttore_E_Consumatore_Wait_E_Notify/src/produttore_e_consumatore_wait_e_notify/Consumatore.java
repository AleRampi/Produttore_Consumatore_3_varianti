package produttore_e_consumatore_wait_e_notify;

public class Consumatore extends Thread{
    private BufWaitNot b;
    private int numero;
    
    public Consumatore(BufWaitNot buf){
        b = buf;
    }
    
    public void run(){
        for(int i = 0; i < 5; i++){
            numero = b.preleva();
            try {
                sleep((int) (Math.random() * 1000));
            } catch (Exception e) {
            }
        }
    }
}
