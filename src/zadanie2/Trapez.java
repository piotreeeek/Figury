package zadanie2;

/**
 * Created by Piotrek on 2017-04-02.
 */
public class Trapez extends Figura {
    private double a;
    private double b;
    private double h;

    public Trapez(){
        super();
        a = 0;
        b = 0;
        h = 0;
        setColor("");
    }
    public Trapez(int a, int b, int h){
        super();
        this.a = (double)a;
        this.b = (double)b;
        this.h = (double)h;
        setColor("");
    }
    public Trapez(int a, int b, int h, String color){
        super();
        this.a = (double)a;
        this.b = (double)b;
        this.h = (double)h;
        setColor(color);
    }

    @Override
    public double obliczPole() {
        return ((a + b)/2)*h;
    }
}
