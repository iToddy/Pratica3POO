package QVeiculos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Onibus extends Veiculos {
	
		int sits;

		/**
		 * @param plaque
		 * @param year
		 * @param sits
		 */
		public Onibus(String plaque, int year, int sits) {
			super(plaque, year);
			this.sits = sits;
		}

		public int getSits() {
			return sits;
		}

		public void setSits(int sits) {
			this.sits = sits;
		} 
		
		public void exibirDados() {
			JOptionPane.showMessageDialog(null, "Dados do veículo Placa: Ano: Assentos: " +plaque + year + sits,"Mensagem", 
					JOptionPane.INFORMATION_MESSAGE);
		}
}
