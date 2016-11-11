package InterfaceNotes;

/**
 * Created by madmann on 10/21/16.
 */
public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock();
        System.out.println(lock.locked());
        lock.setKey(654321);
        System.out.println(lock.locked());
        lock.unlock(654321);
        System.out.println(lock.locked());
        lock.lock(654321);
        System.out.println(lock.locked());
    }

}
