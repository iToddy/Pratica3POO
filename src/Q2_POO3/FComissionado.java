package Q2_POO3;

public class FComissionado extends Funcionario {

	int commissionMonths;
	int productionNull = 0;

	public FComissionado(int matricula, String name, double salary, int commissionMonths, int productionNull) {
		super(matricula, name, salary);
		this.commissionMonths = commissionMonths;
		this.productionNull = productionNull;
	}
	
	public double calcularProventos(){
		return salary + (commissionMonths * commision) +(productionNull * production);
	}

	public int getCommissionMonths() {
		return commissionMonths;
	}

	public void setCommissionMonths(int commissionMonths) {
		this.commissionMonths = commissionMonths;
	}

	public int getProductionNull() {
		return productionNull;
	}

	public void setProductionNull(int productionNull) {
		this.productionNull = productionNull;
	}
	
	
	

}
