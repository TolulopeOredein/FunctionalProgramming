public class RunnableImpl {

    public static void main(String[] args) {
        RunnableImpl impl = new RunnableImpl();
        Runnable r = ()->System.out.println("The runnable s working");
        impl.process(r);
    }
   void process(Runnable r){
        r.run();
    }
}
