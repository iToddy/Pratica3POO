package QVeiculos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class Veiculos {
	
	String plaque;
	int year;
	/**
	 * @param plaque
	 * @param year
	 */
	public Veiculos(String plaque, int year) {
		super();
		this.plaque = plaque;
		this.year = year;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Dados do veículo Placa :" + plaque + year,"Mensagem", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}
