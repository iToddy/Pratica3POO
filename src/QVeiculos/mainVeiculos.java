package QVeiculos;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;


public class mainVeiculos {

	public static void main(String[] args) {
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Qual a classe do ve�culo  1: Onibus  + 2: Caminh�o 3: Ve�culo comum"));
		
		while (option <= 3) {
		
		switch (option) {
		
			case 1: 
				String plaque = JOptionPane.showInputDialog("Digite a placa do �nibus: ");
				
				int year = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do �nibus: "));
				
				int sits = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de assentos do �nibus: "));
				
				Onibus O1 = new Onibus(plaque, year,sits); 
				
				O1.exibirDados();
				
				break;
				
				case 2: 
					
					String plaqueC = JOptionPane.showInputDialog("Digite a placa do caminh�o: ");
					
					int yearC = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do caminh�o: "));
					
					int eixos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de eixos do caminh�o: "));
					
					Caminhao C1 = new Caminhao(plaqueC, yearC, eixos); 
					
					C1.exibirDados();
					
					break;
					
				case 3: 
					String plaqueV = JOptionPane.showInputDialog("Digite a placa do ve�culo: ");
					
					int yearV = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do ve�culo: "));
					
					Veiculos V1 = new Veiculos(plaqueV, yearV); 
					
					V1.exibirDados();
					
					break;
				
				default:
				
				JOptionPane.showMessageDialog(null, "Dados insediros incorretamente, tente novamente","ERRO", 
						JOptionPane.ERROR_MESSAGE);
					
					
					
		}

	}
	
		JOptionPane.showInputDialog("Qual a classe do ve�culo 1: Onibus 2: Caminh�o 3: Ve�culo comum");

	}

}
