package zadanie2;

/**
 * Created by Piotrek on 2017-04-02.
 */
public class Koło extends Figura {
    private int r;

    public Koło(){
        r = 0;
        setColor("");
    }
    public Koło(int r){
        this.r = r;
        setColor("");
    }
    public Koło(int r, String color){
        this.r = r;
        setColor(color);
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(r, 2);
    }
}
