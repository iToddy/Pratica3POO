package Q2_POO3;

import java.util.Scanner;

public class MainFuncionario {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Selecione o seu tipo de contrato: \n (1) Funcionario Padr�o \n (2) Funcion�rio Comissionado e \n (3) Funcion�rio por Produtividade");
		
		short num = entrada.nextShort();
		
		switch (num) {
		
		case 1:
			
			System.out.println("Qual o seu nome");
			int matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			String name = entrada.next();
			
			System.out.println("Qual o seu nome");
			double salary = entrada.nextDouble();
					
			FPadrao F1 = new FPadrao(matricula, name, salary);
			
			FPadrao.calcularProventosPadrao();
			
			break;
			
		case 2: 
			
			System.out.println("Qual o seu nome");
			int matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			String name = entrada.next();
			
			System.out.println("Qual o seu nome");
			double salary = entrada.nextDouble();
			
			System.out.println("Quantos produtos voc� vendeu? ");
			int commissionMonths = entrada.nextInt();
			
			FComissionado F1 = new FComissionado (matricula, name, salary, commissionMonths, productionNull);
			
			FComissionado.calcularProventosComissionado();
			
			break;
			
		case 3: 
			
			System.out.println("Qual o seu nome");
			int matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			String name = entrada.next();
			
			System.out.println("Qual o seu nome");
			double salary = entrada.nextDouble();
			
			System.out.println("Quantas unidade de produtos voc� produziu? ");
			int produtionMonths = entrada.nextInt();
			
			FProdutividade F1 = new FProdutividade(matricula, name, salary, commitionNull, produtionMonths);
			
			FProdutividade.calcularProventosProdutividade();
			
			break;
			
		default: 
			System.out.println("Op��o inv�lida, por favor insira um numero de 1 a 3 ");
		}
	}

}
