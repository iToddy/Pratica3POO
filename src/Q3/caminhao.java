package Q3;

public class caminhao extends veiculos {
	
		int eixos;

		public caminhao(String plaque, int year, int eixos) {
			super(plaque, year);
			this.eixos = eixos;
		}
		

		public int getEixos() {
			return eixos;
		}

		public void setEixos(int eixos) {
			this.eixos = eixos;
		} 
		
		public void exibirdados() {
			
		}
		
		

}
