package QVeiculos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Caminhao extends Veiculos {
	
	int eixos;

	/**
	 * @param plaque
	 * @param year
	 * @param eixos
	 */
	public Caminhao(String plaque, int year, int eixos) {
		super(plaque, year);
		this.eixos = eixos;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
	} 
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Dados do veículo Placa : Ano:" + plaque + year ,"Mensagem", 
				JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Eixos" + eixos,"Mensagem", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
