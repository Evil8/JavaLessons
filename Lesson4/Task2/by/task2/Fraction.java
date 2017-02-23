package by.task2;

/**
 * Created by Anton_Khmyzov on 2/17/2017.
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    public int getNumerator(){
        return this.numerator;
    }
    public int getDenominator(){
        return this.denominator;
    }
    public void show(){
        System.out.println(getNumerator() + "/" + getDenominator());
    }
}

