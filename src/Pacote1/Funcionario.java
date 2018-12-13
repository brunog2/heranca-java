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
		retorno += "Matr�cula: "+matricula+"\n";
		retorno += "Sal�rio: "+salario+"\n";
		return retorno;
	}

}

