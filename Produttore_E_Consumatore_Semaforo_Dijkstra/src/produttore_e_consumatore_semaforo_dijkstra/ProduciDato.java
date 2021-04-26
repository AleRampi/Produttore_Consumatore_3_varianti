package produttore_e_consumatore_semaforo_dijkstra;

public class ProduciDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5; //numero elementi da produrre
    final int attesa = 500; //tempo di risposta/attesa

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    public void run(){
        for (int i = 0; i < tanti; i++) {
            vuoto.P();
            Main.buffer = i;
            System.out.println("Scrittore: dato scritto :" + i);
            pieno.V();
            try{
                Thread.sleep(attesa);
            } catch (Exception e){                
            }
        }
        System.out.println("Scrittore: termine scrittura dati.");
    }
}
