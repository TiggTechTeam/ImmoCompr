import java.util.ArrayList;
import java.util.Scanner;

public class mainImmo {

    public static void main(String[] args) {


        System.out.println("1. OBJEKT : Bitte geben Sie um Es welche Objekt geht_:  (1)Wohnung, (2)Haus, (3)Grundstuck" );

        Scanner i1 = new Scanner(System.in);
        int ii = i1.nextInt();
        System.out.println(i1);

        switch (ii) {
            case 1:
                ArrayList<Wohnung> w = new ArrayList<>() ;
                Scanner input = new Scanner(System.in);



                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double c = input.nextDouble();

                    w.add(new Wohnung(a,b,c));

                    System.out.print(w.toString());



                break;
            case 2:
                ArrayList<Haus> ha = new ArrayList<>() ;
                Scanner input1 = new Scanner(System.in);



                    double d = input1.nextDouble();
                    double e = input1.nextDouble();
                    double f = input1.nextDouble();

                    ha.add(new Haus(d,e,f));

                    System.out.print(ha.toString());


                break;
            case 3:
                ArrayList<Grundstueck> gr = new ArrayList<>() ;
                Scanner input2 = new Scanner(System.in);



                    double g = input2.nextDouble();
                    double h = input2.nextDouble();
                    double j = input2.nextDouble();

                    gr.add(new Grundstueck(g,h,j));

                    System.out.print(gr.toString());


                break;

            default:
                System.out.println("Bitte geben Sie (1) für Wohnung  oder (2) für Haus ein");
        }
        System.out.println("---------------------------");
        System.out.println("2. OBJEKT : Bitte geben Sie um Es welche Objekt geht_:  (1)Wohnung, (2)Haus, (3)Grundstuck" );
        Scanner i2 = new Scanner(System.in);
        int ii2 = i1.nextInt();
        System.out.println(i1);

        switch (ii2) {
            case 1:
                ArrayList<Wohnung> w = new ArrayList<>() ;
                Scanner input = new Scanner(System.in);



                    double a = input.nextDouble();
                    double b = input.nextDouble();
                    double c = input.nextDouble();

                    w.add(new Wohnung(a,b,c));

                    System.out.print(w.toString());


                break;
            case 2:
                ArrayList<Haus> ha = new ArrayList<>() ;
                Scanner input1 = new Scanner(System.in);



                    double d = input1.nextDouble();
                    double e = input1.nextDouble();
                    double f = input1.nextDouble();

                    ha.add(new Haus(d,e,f));

                    System.out.print(ha.toString());


                break;
            case 3:
                ArrayList<Grundstueck> gr = new ArrayList<>() ;
                Scanner input2 = new Scanner(System.in);



                    double g = input2.nextDouble();
                    double h = input2.nextDouble();
                    double j = input2.nextDouble();

                    gr.add(new Grundstueck(g,h,j));

                    System.out.print(gr.toString());


                break;

            default:
                System.out.println("Bitte geben Sie (1) für Wohnung  oder (2) für Haus ein");
        }








        /*
        //Instanzen von Immobilien aufrufen z.B:  Wohnung , Haus etc
        // ArrayList vielleicht mit for Schleife oder While Schlife (so lange ich sachen eingebe)
        //ArraList <------------- w1, w2 , h1, h2......g1 etc    (mit den notwendigen parametern wie z.B sqmeter preis...etc) 

        Wohnung w1 = new Wohnung(23.342,2424.23,232);

        Haus h1 = new Haus(232.234,2342.23,2324.42);
        h1.getTheMarge(4343.34,4234);
        h1.setSqmeter(23.22);
        double k = h1.getSqmeter();
        System.out.println(h1.toString()+ "Es kommt nochmal: " +k);

        Grundstueck g1 = new Grundstueck(23.23,324.43, 34242.3232);

 */

    }

}
