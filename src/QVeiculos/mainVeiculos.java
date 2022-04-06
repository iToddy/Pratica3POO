package QVeiculos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;


public class mainVeiculos {

	public static void main(String[] args) {
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Qual a classe do veículo  1: Onibus  + 2: Caminhão 3: Veículo comum"));
		
		while (option <= 3) {
		
		switch (option) {
		
			case 1: 
				String plaque = JOptionPane.showInputDialog("Digite a placa do ônibus: ");
				
				int year = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do ônibus: "));
				
				int sits = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de assentos do ônibus: "));
				
				Onibus O1 = new Onibus(plaque, year,sits); 
				
				O1.exibirDados();
				
				break;
				
				case 2: 
					
					String plaqueC = JOptionPane.showInputDialog("Digite a placa do caminhão: ");
					
					int yearC = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do caminhão: "));
					
					int eixos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eixos do caminhão: "));
					
					Caminhao C1 = new Caminhao(plaqueC, yearC, eixos); 
					
					C1.exibirDados();
					
					break;
					
				case 3: 
					String plaqueV = JOptionPane.showInputDialog("Digite a placa do veículo: ");
					
					int yearV = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veículo: "));
					
					Veiculos V1 = new Veiculos(plaqueV, yearV); 
					
					V1.exibirDados();
					
					break;
				
				default:
				
				JOptionPane.showMessageDialog(null, "Dados insediros incorretamente, tente novamente","ERRO", 
						JOptionPane.ERROR_MESSAGE);
					
					
					
		}

	}
	
		JOptionPane.showInputDialog("Qual a classe do veículo 1: Onibus 2: Caminhão 3: Veículo comum");

	}

}
