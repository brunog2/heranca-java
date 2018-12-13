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
	public String recuperarInformacao() {
		String retorno = super.recuperarInformacao();
		retorno += "Tipo: "+tipo+"\n";
		return retorno;
	}

	
}
