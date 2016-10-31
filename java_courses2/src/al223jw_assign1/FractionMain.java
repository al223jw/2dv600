package al223jw_assign1;


public class FractionMain {
    public static void main(String[] args) {

        // Change theese variables if you want to test IsNegative or IsEqualTo.
        Fraction frac1 = new Fraction(1, 3);
        Fraction frac2 = new Fraction(5, 6);

        System.out.println("IsNegative");
        System.out.println(frac1.isNegative());

        System.out.println("");
        System.out.println("IsEqualTo");
        System.out.println(frac1.isEqualTo(frac2));

        System.out.println("");
        System.out.println("Add");
        System.out.println(frac1.toString());
        System.out.println(frac1.add(frac2).toString());

        System.out.println("");
        System.out.println("Sub");
        System.out.println(frac2.toString());
        System.out.println(frac2.subtract(frac1).toString());

        System.out.println("");
        System.out.println("Multiply");
        System.out.println(frac1.toString());
        System.out.println(frac1.multiply(frac2).toString());

        System.out.println("");
        System.out.println("Divide");
        System.out.println(frac2.toString());
        System.out.println(frac2.divide(frac1).toString());
    }
}
