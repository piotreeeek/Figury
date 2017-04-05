package zadanie2;

import java.util.Random;

/**
 * Created by Piotrek on 2017-04-05.
 */
public class RandomFiguraGenerator {
    private Random generator = new Random();

    public Figura next(){
        switch(generator.nextInt(5)){
            default:;
            case 0: return new Prostokąt(generator.nextInt(10)+1,generator.nextInt(10)+1);
            case 1: return new Kwadrat(generator.nextInt(10)+1);
            case 2: return new Trójkąt(generator.nextInt(10)+1,generator.nextInt(10)+1);
            case 3: return new Koło(generator.nextInt(10)+1);
            case 4: return new Trapez(generator.nextInt(10)+1,generator.nextInt(10)+1,generator.nextInt(10)+1);
        }
    }
}
