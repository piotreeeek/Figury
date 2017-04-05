package zadanie2;

/**
 * Created by Piotrek on 2017-04-02.
 */
public class Trójkąt extends Figura {
    private double a;
    private double h;

    public Trójkąt(){
        super();
        a = 0;
        h= 0;
        setColor("");
    }
    public Trójkąt(int a, int h){
        super();
        this.a = (double)a;
        this.h= (double)h;
        setColor("");
    }
    public Trójkąt(int a, int h, String color){
        super();
        this.a = (double)a;
        this.h= (double)h;
        setColor(color);
    }

    @Override
    public double obliczPole() {
        return (a * h)/2;
    }
}
