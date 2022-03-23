package PRATICA3;

public class Ingresso_Camarote extends Ingresso {
		
		double addValor2 = price + 100;
		String local = "Camarote azul";

		public Ingresso_Camarote(double price, int addValor2, String local) {
			super(price);
			this.addValor2 = addValor2;
			this.local = local;
		}
		
		
		public double addValor2( ) {
			return addValor2;
		}
		
		public void getVIP(){
			System.out.println("Ingresso VIP, valor: " + addValor2);
		}
		
		
}
