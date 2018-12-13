package Pacote2;
import Pacote1.*;
public class Gerente extends Funcionario{
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String toString() {
		String retorno = super.toString();
		retorno += "Tipo: "+tipo+"\n";
		return retorno;
	}

	
}
