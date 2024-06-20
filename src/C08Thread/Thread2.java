package C08Thread;

public class Thread2 implements Runnable{

    @Override
    public void run() {
        Library.borrow();
    }

}
