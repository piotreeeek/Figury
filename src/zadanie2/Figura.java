package zadanie2;

import java.util.Comparator;

/**
 * Created by Piotrek on 2017-04-02.
 */
public abstract class Figura{

    private String color;

    public void setColor(String color){
        this.color = color;
    };
    public  String getColor(){
        return color;
    }
    public abstract double obliczPole();

    @Override
    public String toString(){
      return "Nazwa figury, pole = " + getClass().getSimpleName() + ", " + this.obliczPole();
    }

    @Override
    public boolean equals(Object obj) {
        return this.obliczPole() == ((Figura)obj).obliczPole();
    }
}

class ComparatorPole implements Comparator<Figura> {
    @Override
    public int compare(Figura o1, Figura o2) {
        return Double.compare(o1.obliczPole(),o2.obliczPole());
    }
}
