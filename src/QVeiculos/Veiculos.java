package QVeiculos;

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
		JOptionPane.showMessageDialog(null, "Dados do ve�culo" /n + "Placa :" + plaque,"Mensagem", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}
