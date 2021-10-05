/**
 * @author Bretbacher Elijah
 * @version Threads 1.0
 * @date 05.10.2021
 */
public class CountPrinter extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            System.out.println(i);
        }
    }
}