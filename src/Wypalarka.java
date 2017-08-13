/**
 * Created by Ромашка on 13.08.2017.
 */
public class Wypalarka {

    private String people;
    private String machine;

    protected Wypalarka(final String people, final String machine) {
        this.people = people;
        this.machine = machine;
    }

    public String nameWorkerAndMachine() {
        String res = "The name of worker is " + people + "\nThe name of machine is " + machine;
        return res;
    }
}
