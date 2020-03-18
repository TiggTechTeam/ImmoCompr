public class Haus extends Immobilien{


    private  double GrundSteuer;
    private double sqmeter, preis;

    public Haus(double sqmeter, double preis, double GrundSteuer){
        super(sqmeter,preis);
        this.GrundSteuer=GrundSteuer;


    }

    public static double getTheMarge(double preis, double rendite ){
        double Marge = preis * rendite;

        return  Marge;
    }

    public String toString(){

        return "Coole Sache: " +getTheMarge(32.232,32323);
    }







}
