
public class Wohnung<T> {
	
	T a;
	T b;
	
	public Wohnung(T a , T b) {
		this.a=a;
		this.b=b;
	}
	public double getSum(double a ,double b) {
		double sum ;
		sum = a + b;
		return sum;
	}
	
	public String toString() {
			
		
		return "Erg: " +a+ "," +b  ;
	}
		

}
