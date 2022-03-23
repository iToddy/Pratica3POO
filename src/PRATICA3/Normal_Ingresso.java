package PRATICA3;

public class Normal_Ingresso extends Ingresso {
	
	public Normal_Ingresso(double price) {
		super(price);
	}
	
	public double valorIngresso() {
			return price;
		}
	
	public void getIngresso() {
		System.out.println(valorIngresso());	
	}

}
