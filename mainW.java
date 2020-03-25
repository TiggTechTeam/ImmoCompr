import java.util.ArrayList;
import java.util.Scanner;

public class mainW {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Wie viele Punkte einlesen?");
	ArrayList<Wohnung>WohnungListe = new ArrayList<>();
	
	int anzhl = sc.nextInt();
	int i = 0;
	double x, y ;
	int zahl;
	while (i < anzhl) {
		System.out.println("Ist diese Wohnung was ? (1) wenn Wohnung (2) wenn Haus ");
		zahl = sc.nextInt();
		if(zahl ==1) {
		
			System.out.println("Welche W1 Kooridante ");
			x = sc.nextDouble();
			System.out.println("Welche W2 Kooridante ");
			y =sc.nextDouble();
			Wohnung w = new Wohnung(x,y);
			WohnungListe.add(w);
			i++;
			
			
		}
		if(zahl ==2) {
			
			System.out.println("Welche H1 Kooridante ");
			x = sc.nextDouble();
			System.out.println("Welche H2 Kooridante ");
			y =sc.nextDouble();
			Wohnung w = new Wohnung(x,y);
			WohnungListe.add(w);
			i++;
			
			
		}
		
	}	
	
		
		System.out.println(WohnungListe.toString());
		//System.out.println(getSum());
			
		
//		
//		ArrayList<Integer> bbb = new ArrayList();
//		ArrayList<Wohnung> bb = new ArrayList();
//		//Wohnung ab = new Wohnung(); 
//		System.out.println("Wie viele Objekte wollen Sie vergleichen ");
//		System.out.println("Welche form 1 z.B Wohnung: ");
//		Scanner i1 = new Scanner(System.in);
//        int ii = i1.nextInt();
//        int x = 2;
//        int z = 3;
//        
//        //Google Objekte in einem Array Speicher....futter das Array mit Objekte 
//		for(int i = 0; i < bb.size(); i++) {
//			bb.add(new Wohnung(x,z) );
//
//				System.out.println(bb);
//			
//		}
		
		
		
	}

}
