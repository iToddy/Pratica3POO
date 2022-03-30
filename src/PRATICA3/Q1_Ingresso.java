package PRATICA3;

import java.util.Scanner;

public class Q1_Ingresso {
	
	public static void main(String[]args) {	
	
	Scanner entrada= new Scanner(System.in);
	
	System.out.println("Selecione o seu ingresso: \n (1) Ingresso Normal \n (2) VIP e \n (3)Camarote");
	
	short num = entrada.nextShort();
	
	switch (num) {
	
		case 1:
			System.out.println("Qual o valor do ingresso");
			double price = entrada.nextDouble();
			
			Normal_Ingresso ticketN = new Normal_Ingresso(price);

			ticketN.getIngresso();
			
			break;
		
		case 2:
			
			System.out.println("Qual o valor do ingresso");
			price = entrada.nextDouble();
			
			double addValor = price + 70;
			
			Ingresso_VIP ticketVIP = new Ingresso_VIP(price, addValor);
	
			ticketVIP.getVIP();
			
			break;
			
		case 3: 
			
			System.out.println("Qual o valor do ingresso");
			price = entrada.nextDouble();
			
			
			System.out.println("Qual o setor do ingresso");
			String local = entrada.next();
			
			double addValor2 = price + 100;
			
			Ingresso_Camarote ticketCam = new Ingresso_Camarote(price, addValor2, local);
			
			ticketCam.getCAM();
			
			break;
			
		default: 
			System.out.println("Opção inválida, por favor insira um numero de 1 a 3 ");
		}
	
		
	}

}

