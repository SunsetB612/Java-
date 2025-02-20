public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        //This returns how many threads currently are active
        System.out.println(Thread.activeCount());
        //set the name of main thread
        Thread.currentThread().setName("MAINNNNNN");
        //return the name of main thread
        System.out.println(Thread.currentThread().getName());
        //set the priority of main thread between 1 and 10
        Thread.currentThread().setPriority(10);
        //get the priority of main thread
        System.out.println(Thread.currentThread().getPriority());
        //check the main thread is alive (true or false)
        System.out.println(Thread.currentThread().isAlive());
        for(int i = 3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        */
         MyThread thread2 = new MyThread();
         thread2.setDaemon(false);
         System.out.println(thread2.isDaemon());
         thread2.start();
         //System.out.println(thread2.isAlive());
         //thread2.setName("2nd thread");
         //System.out.println(thread2.getName());
         //thread2.setPriority(1);
         //System.out.println(thread2.getPriority());
    }
}