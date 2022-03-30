package Q2_POO3;

import java.util.Scanner;

public class MainFuncionario {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Selecione o seu tipo de contrato: \n (1) Funcionario Padrão \n (2) Funcionário Comissionado e \n (3) Funcionário por Produtividade");
		
		short num = entrada.nextShort();
		
		switch (num) {
		
		case 1:
			
			System.out.println("Qual a sua matrícula");
			int matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			String name = entrada.next();
			
			System.out.println("Qual o seu salário");
			double salary = entrada.nextDouble();
					
			FPadrao F1 = new FPadrao(matricula, name, salary);
			
			F1.calcularProventos();
			
			System.out.println(F1.toString());
			
			break;
			
		case 2: 
			
			System.out.println("Qual o seu nome");
			 matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			name = entrada.next();
			
			System.out.println("Qual o seu salário");
			salary = entrada.nextDouble();
			
			System.out.println("Quantos produtos você vendeu? ");
			int commissionMonths = entrada.nextInt();
			
			int productionNull = 0;
			
			FComissionado FC1 = new FComissionado (matricula, name, salary, commissionMonths, productionNull);
			
			FC1.calcularProventos();
			
			System.out.println(FC1.toString());
			
			break;
			
		case 3: 
			
			System.out.println("Qual o seu nome");
			matricula = entrada.nextInt();
			
			System.out.println("Qual o seu nome");
			 name = entrada.next();
			
			System.out.println("Qual o seu nome");
			salary = entrada.nextDouble();
			
			System.out.println("Quantas unidade de produtos você produziu? ");
			int produtionMonths = entrada.nextInt();
			
			int commissionNull = 0;
			
			FProdutividade FP1 = new FProdutividade(matricula, name, salary, commissionNull, produtionMonths);
			
			FP1.calcularProventos();
			
			System.out.println(FP1.toString());
			
			break;
			
		default: 
			System.out.println("Opção inválida, por favor insira um numero de 1 a 3 ");
		}
	}

}
