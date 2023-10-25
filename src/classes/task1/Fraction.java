package classes.task1;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public void print() {
        System.out.println(numerator + " / " + denominator);
    }


    public double sum(double sumNumerator, double sumDenominator, double numerator) {
        numerator = numerator * sumDenominator;
        sumNumerator = sumNumerator * denominator;
        sumDenominator = sumDenominator * denominator;
        sumNumerator = sumNumerator + numerator;
        return sumNumerator / sumDenominator;
    }

    public double multiplication(double mNumerator, double mDenominator) {
        mNumerator = numerator * mNumerator;
        mDenominator = denominator * mDenominator;
        return mNumerator / mDenominator;
    }
    public double division( double dNumerator, double dDenominator){
        dNumerator = denominator*dNumerator;
        dDenominator = numerator*dDenominator;
        return dDenominator/dNumerator;
    }
}
