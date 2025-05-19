public class Main {
    public static void main(String[] args) {
        Grafica g = new Grafica();
        g.setVisible(true);
        System.out.println("Inizio dei thread figli");
        MyThread mt = new MyThread(" Figlio #1", g);
        MyThread2 mt2 = new MyThread2(" Figlio #2", g);
        MyThread3 mt3 = new MyThread3(" Figlio #3", g);

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Thread principale interrotto.");
            }
        } while (mt.count != 3 && mt2.count != 3 && mt3.count != 3);
        System.out.println("Termine thread principale.");
    }
}
