package Q2_POO3;

public class FProdutividade extends Funcionario {

		int commitionNull = 0;
		int produtionMonths;
		
		
		public FProdutividade (int matricula, String name, double salary, int commitionNull, int produtionMonths) {
			super(matricula, name, salary);
			this.commitionNull = commitionNull;
			this.produtionMonths = produtionMonths;
		} 
		
		public double calcularProventosProdutividade(){
			return salary + (commitionNull * commision) +(produtionMonths * production);
		}
		public int getCommitionNull() {
			return commitionNull;
		}

		public void setCommitionNull(int commitionNull) {
			this.commitionNull = commitionNull;
		}

		public int getProdutionMonths() {
			return produtionMonths;
		}

		public void setProdutionMonths(int produtionMonths) {
			this.produtionMonths = produtionMonths;
		}
		
		

	}


