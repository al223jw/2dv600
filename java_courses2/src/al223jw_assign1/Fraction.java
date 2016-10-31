package al223jw_assign1;

public class Fraction {

    int n = 0;
    int d = 0;
    int f = 0;

    public Fraction(int n, int d)
    {
        this.n = n;
        this.d = d;
        this.f = n/d;
    }

    private int getNumerator()
    {
        int numerator = this.n;

        return numerator;
    }

    private int getDenominator()
    {
        int denominator = this.d;

        return denominator;
    }

    public boolean isNegative()
    {
        if(((double)this.n/this.d) < 0)
        {
            return true;
        }
        return false;
    }

    public Fraction add(Fraction frac) {

        int newNum;
        int newDemo;

        if (this.d != frac.getDenominator()) {
             newNum = this.n * frac.getDenominator() + frac.getNumerator() * this.d;
             newDemo = this.d * frac.getDenominator() + frac.getDenominator() * this.d;
        }

        newNum = this.n + frac.getNumerator();
        newDemo = this.d;

        Fraction newFrac = new Fraction(newNum, newDemo);

        return newFrac;
    }

    public Fraction subtract(Fraction frac)
    {
        int newNum;
        int newDemo;

        if (this.d != frac.getDenominator()) {
            newNum = this.n * frac.getDenominator() - frac.getNumerator() * this.d;
            newDemo = this.d * frac.getDenominator() - frac.getDenominator() * this.d;
        }

        newNum = this.n - frac.getNumerator();
        newDemo = this.d;

        Fraction newFrac = new Fraction(newNum, newDemo);

        return newFrac;
    }

    public Fraction multiply(Fraction frac)
    {
        int numAdd = frac.getNumerator();
        int denoAdd = frac.getDenominator();
        int num = this.n;
        int deno = this.d;

        Fraction newFrac = new Fraction((num * numAdd), (deno * denoAdd));

        return newFrac;
    }

    public Fraction divide(Fraction frac)
    {
        int numAdd = frac.getNumerator();
        int denoAdd = frac.getDenominator();

        int num = this.n;
        int deno = this.d;

        int temp = denoAdd;
        denoAdd = numAdd;
        numAdd = temp;


        Fraction newFrac = new Fraction((num / numAdd), (deno / denoAdd));

        return newFrac;
    }

    public boolean isEqualTo(Fraction frac)
    {
        int numAdd = frac.getNumerator();
        int denoAdd = frac.getDenominator();

        int num = this.n;
        int deno = this.d;

        if((num * denoAdd) == (numAdd * deno))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        int n = this.getNumerator();
        int d = this.getDenominator();

        String print = n + "/" + d;

        return print;
    }

}
