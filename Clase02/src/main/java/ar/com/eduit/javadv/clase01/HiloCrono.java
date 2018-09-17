package ar.com.eduit.javadv.clase01;

public class HiloCrono implements Runnable{
    private Control control;
    private int cont = 0;
    private boolean correr = false;

    public HiloCrono(Control control) {
        this.control = control;
    }
    
    @Override
    public void run() {
        while(true) {
            try {Thread.sleep(1000);}catch(Exception e) {}
            if(correr) {
                cont++;
                control.setText(cont + "");
            }
        }
    }
    
    public void start(){correr = true;}
    public void pause() {correr = false;}
    public void reset() {
        correr = false;
        cont = 0;
        control.setText("0");
    }
    
}