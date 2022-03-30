package Q2_POO3;

public class FProdutividade extends Funcionario {

		private int commissionNull = 0;
		private int produtionMonths;
		
		
		public FProdutividade (int matricula, String name, double salary, int commitionNull, int produtionMonths) {
			super(matricula, name, salary);
			this.commissionNull = commitionNull;
			this.produtionMonths = produtionMonths;
		} 
		
		public double calcularProventos(){
			return salary + (commissionNull * commision) +(produtionMonths * production);
		}
		public int getCommitionNull() {
			return commissionNull;
		}

		public void setCommitionNull(int commitionNull) {
			this.commissionNull = commitionNull;
		}

		public int getProdutionMonths() {
			return produtionMonths;
		}

		public void setProdutionMonths(int produtionMonths) {
			this.produtionMonths = produtionMonths;
		}
		
		

	}


