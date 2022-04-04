package QVeiculos;

import java.awt.BorderLayout;

import java.util.Scanner;

public class mainVeiculos {

	public static void main(String[] args) {
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Qual a classe do veículo " /n + "1: Onibus" /n  + "2: Caminhão" /n "3: Veículo comum"));
		
		while (option <= 3) {
		
		switch (option) {
		
			case 1: 
				System.out.print(("Qual a placa do conibus?");
				String plaque = entrada.next();
				
				System.out.print(("Qual o ano do onibus?");
				int year = entrada.nextInt();
				
				System.out.print(("Qual o número de assentos do onibus?");
				int sits = entrada.nextInt();
				
				Onibus O1 = new Onibus; 
				
				O1.exibirDados();
				
				break;
				
				case 2: 
					
					System.out.print(("Qual a placa do caminhão?");
					String plaque = entrada.next();
					
					System.out.print(("Qual o ano do caminhão?");
					int year = entrada.nextInt();
					
					System.out.print(("Qual o número de eixos do caminhão?");
					int eixos = entrada.nextInt();
					
					Caminhao C1 = new Caminhao; 
					
					C1.exibirDados();
					
					break;
					
				case 3: 
					System.out.print(("Qual a placa do caminhão?");
					String plaque = entrada.next();
					
					System.out.print(("Qual o ano do caminhão?");
					int year = entrada.nextInt();
					
					Veiculo V1 = new Veiculo; 
					
					V1.exibirDados();
					
					break;
				
				default
				
				JOptionPane.showMessageDialog(null,  "Dados insediros incorretamente, tente novamente","ERRO", 
						JOptionPane.ERROR_MESSAGE);
					
					
					
		}

	}
	
		JOptionPane.showInputDialog("Qual a classe do veículo " /n + "1: Onibus" /n  + "2: Caminhão" /n "3: Veículo comum");

	}

}
