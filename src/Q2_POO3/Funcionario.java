package Q2_POO3;

public abstract class Funcionario {

	public int matricula;
	public String name;
	public double salary;
	public int commision = 100;
	public int production = 60;

	public Funcionario(int matricula, String name, double salary) {
		super();
		this.matricula = matricula;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract double calcularProventos();
		
	
	
	
	public String toString(){
		return "Valor a receber " + calcularProventos();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public int getProduction() {
		return production;
	}

	public void setProduction(int production) {
		this.production = production;
	}

	
	
}
