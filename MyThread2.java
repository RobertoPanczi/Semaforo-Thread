import java.awt.Color;

public class MyThread2 implements Runnable {
        int count;
        Grafica g;
        Thread tred;
    
        // crea un nuovo thread.
        MyThread2(String name, Grafica g) {
            this.g = g;
            count = 0;
            tred = new Thread(this, name);
            tred.start();
        }
    
        public void run() {
            System.out.println(tred.getName() + "inizio.");
            try {
                Thread.sleep(3000);

                do {
                    g.setColore(1, Color.RED);
                    Thread.sleep(5000);
                    g.setColore(1, Color.GREEN);
                    Thread.sleep(3000);
                    g.setColore(1, Color.YELLOW);
                    Thread.sleep(2000);
                    count++;
                } while (count < 3);
            } catch (InterruptedException exc) {
                System.out.println(tred.getName() + "interrotto.");
            }
            System.out.println(tred.getName() + " terminato!");
        }
    }

