public class Immobilien {

    private double sqmeter;
    private  double preis;
    private double rendite;
    private String stadt;

    public  Immobilien(double sqmeter, double preis ){
        this.sqmeter=sqmeter;
        this.preis=preis;
    }

    public void setSqmeter(double n){
        sqmeter = n;
    }

    public double getSqmeter(){
        return sqmeter;
    }


    public static double getTheMarge(double preis, double rendite ){
        double Marge = preis * rendite;

        return  Marge;
    }

    public String toString(){
        return " " ;
    }





}
