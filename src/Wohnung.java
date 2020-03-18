public class Wohnung extends Immobilien {

    private  double HausGeld;
    //Plus notwendige Attribute

    public Wohnung(double sqmeter, double preis, double HausGeld){
        super(sqmeter,preis);
        this.HausGeld= HausGeld;

    }
    public static double getTheMarge(double preis, double rendite ){
        double Marge = preis * rendite;

        return  Marge;
    }

    public String toString(){
        return " Hausgeld "+HausGeld;
    }



}
