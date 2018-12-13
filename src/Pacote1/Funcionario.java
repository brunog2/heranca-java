package Pacote1;

public class Funcionario extends Pessoa{
	private String matricula;
	private double salario;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String recuperarInformacao() {
		String retorno = super.recuperarInformacao();
		retorno += "Matrícula: "+matricula+"\n";
		retorno += "Salário: "+salario+"\n";
		return retorno;
	}

}

