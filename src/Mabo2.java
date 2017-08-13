/**
 * Created by Ромашка on 13.08.2017.
 */
public class Mabo2 {

    public static void main(String[] args) {

        Wypalarka wypalarka = new Wypalarka("Roman", "Wypalarka");
        System.out.println(wypalarka.nameWorkerAndMachine());

        Lazer lazer = new Lazer("John");
        lazer.getDetails();
        lazer.getWorker();
    }


}
