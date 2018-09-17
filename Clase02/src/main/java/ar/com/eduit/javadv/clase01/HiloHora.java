package ar.com.eduit.javadv.clase01;

import java.time.LocalDateTime;

public class HiloHora implements Runnable{
    private Control control;

    public HiloHora(Control control) {
        this.control = control;
    }
    
    @Override
    public void run() {
        while(true) {
            LocalDateTime ldt = LocalDateTime.now();
            String hora = (ldt.getHour() < 10) ? "0" + ldt.getHour() : "" + ldt.getHour();
            String minuto = (ldt.getMinute() < 10) ? "0" + ldt.getMinute() : "" + ldt.getMinute();
            String segundo = (ldt.getSecond() < 10) ? "0" + ldt.getSecond() : "" + ldt.getSecond();
            
            control.setText(hora + ":" + minuto + ":" + segundo);
            
            try {Thread.sleep(1000);}catch(Exception e) {}
        }
    }
}