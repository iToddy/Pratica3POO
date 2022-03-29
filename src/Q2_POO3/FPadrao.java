package Q2_POO3;

public class FPadrao extends Funcionario {

	int commissionDefaut = 0;
	int poductionDefaut = 0;
	
	public FPadrao (int matricula, String name, double salary) {
		super(matricula, name, salary);
		this.matricula = matricula;
		this.name = name;
		this.salary = salary;

	}

	public double calcularProventosPadrao(){
		return salary + (commissionDefaut * commision) +(poductionDefaut * production);
	}

	public int getCommissionDefaut() {
		return commissionDefaut;
	}

	public void setCommissionDefaut(int commissionDefaut) {
		this.commissionDefaut = commissionDefaut;
	}

	public int getPoductionDefaut() {
		return poductionDefaut;
	}

	public void setPoductionDefaut(int poductionDefaut) {
		this.poductionDefaut = poductionDefaut;
	}
	
	
}
