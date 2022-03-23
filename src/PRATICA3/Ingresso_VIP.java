package PRATICA3;

public class Ingresso_VIP extends Ingresso {
	
	double addValor = price + 70;

	public Ingresso_VIP(double price, double addValor) {
		super(price);
		this.addValor = addValor;
	}
	
	public double addValor() {
		return addValor;
	}
	
	public void getVIP(){
		System.out.println("Ingresso VIP, valor: " + addValor);
	}
	
	

	
}


