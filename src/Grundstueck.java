
public class Grundstueck extends Immobilien {

    private double sqmeter;
    private  double preis;
    private double steuer;

    public Grundstueck(double sqmeter, double preis, double steuer ){
        super(sqmeter,preis);
        this.steuer=steuer;

    }
    public static double getTheMarge(double preis, double rendite ){
        double Marge = preis * rendite;

        return  Marge;
    }
}
