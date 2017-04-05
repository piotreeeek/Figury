package zadanie2;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Piotrek on 2017-04-02.
 */
public class Start {
    public static void main(String[] args) {
        RandomFiguraGenerator gen = new RandomFiguraGenerator();
        List<Figura> lista = new ArrayList<Figura>();

        for (int i = 0; i < 20 ; i++){
           lista.add(gen.next());
        }
        for(Figura figura : lista) {
            System.out.println(figura);
        }
        System.out.println("\n");
        lista.sort(new ComparatorPole());
        for(Figura figura : lista) {
            System.out.println(figura);
        }


    }
}
