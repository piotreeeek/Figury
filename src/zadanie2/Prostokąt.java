package zadanie2;

/**
 * Created by Piotrek on 2017-04-02.
 */
public class Prostokąt extends Figura {
    private int a;
    private int b;

    public Prostokąt(){
        super();
        a = 0;
        b = 0;
        setColor("");
    }
    public Prostokąt(int a,int b){
        super();
        this.a = a;
        this.b = b;
        setColor("");
    }
    public Prostokąt(int a,int b, String color){
        super();
        this.a = a;
        this.b = b;
        setColor(color);
    }

    @Override
    public double obliczPole() {
        return a * b;
    }
}
