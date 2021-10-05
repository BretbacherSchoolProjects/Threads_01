/**
 * @author Bretbacher Elijah
 * @version Threads 1.0
 * @date 05.10.2021
 */
public class Main {
    public static void main(String[] args) {
        DatePrinter dp = new DatePrinter();
        CountPrinter cp = new CountPrinter();

        dp.start();
        cp.start();
    }
}
