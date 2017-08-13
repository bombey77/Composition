/**
 * Created by Ромашка on 13.08.2017.
 */
public class Lazer {

    private int details;
    private String worker;

    Lazer(final String worker) {
        this.worker = worker;
    }

    public int getDetails() {
        details = 55;
        System.out.println(details);
        return details;
    }

    public String getWorker() {
        System.out.println(worker);
        return worker;
    }
}
