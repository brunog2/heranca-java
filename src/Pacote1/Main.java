package Pacote1;
import Pacote2.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		System.out.println("---SISTEMA---");
		while(true) {
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Sair\n");
			System.out.print("Informe a opção: "); 	
			String opc = entrada.nextLine();
			
			if (opc.equals("1")) {
				System.out.println("\n---CADASTRO DE USUÁRIO---");
				System.out.println("1 - Funcionário");
				System.out.println("2 - Gerente");
				System.out.println("3 - Supervisor");
				System.out.print("Informe o tipo de usuário: ");
				String opc1 = entrada.nextLine();
				System.out.println();
				
				if (opc1.equals("1")) {
					System.out.println("\n---Cadastro de funcionário---");
					System.out.print("Nome: ");
					String nome = entrada.nextLine();
					System.out.println();
					System.out.print("CPF: ");
					String cpf = entrada.nextLine();
					System.out.println();
					System.out.print("Matrícula: ");
					String matricula = entrada.nextLine();
					System.out.println();
					System.out.print("Salário: ");
					double salario = entrada.nextDouble();
					System.out.println();
					entrada.nextLine();
					
					Funcionario funcionario = new Funcionario();
					funcionario.setNome(nome);
					funcionario.setCpf(cpf);
					funcionario.setMatricula(matricula);
					funcionario.setSalario(salario);
					
					pessoas.add(funcionario);
				}
				
				else if (opc1.equals("2")) {
					System.out.println("\n---Cadastro de gerente---");
					System.out.print("Nome: ");
					String nome = entrada.nextLine();
					System.out.println();
					System.out.print("CPF: ");
					String cpf = entrada.nextLine();
					System.out.println();
					System.out.print("Matrícula: ");
					String matricula = entrada.nextLine();
					System.out.println();
					System.out.print("Salário: ");
					double salario = entrada.nextDouble();
					entrada.nextLine();
					System.out.println();
					System.out.print("Tipo: ");
					String tipo = entrada.nextLine();
					System.out.println();
					
					Gerente gerente = new Gerente ();
					gerente.setNome(nome);
					gerente.setCpf(cpf);
					gerente.setMatricula(matricula);
					gerente.setSalario(salario);
					gerente.setTipo(tipo);
					
					pessoas.add(gerente);
				}
				
				else if (opc1.equals("3")) {
					System.out.println("\n---Cadastro de supervisor---");
					System.out.println("Nome: ");
					String nome = entrada.nextLine();
					System.out.println("CPF: ");
					String cpf = entrada.nextLine();
					System.out.println("Matrícula: ");
					String matricula = entrada.nextLine();
					System.out.println("Salário: ");
					double salario = entrada.nextDouble();
					entrada.nextLine();
					System.out.println("Formação: ");
					String formacao = entrada.nextLine();
					
					Supervisor supervisor = new Supervisor();
					supervisor.setNome(nome);
					supervisor.setCpf(cpf);
					supervisor.setMatricula(matricula);
					supervisor.setSalario(salario);
					supervisor.setFormacao(formacao);
					
					pessoas.add(supervisor);
				}
				
				else {
					System.out.println("Opção inválida!");
				}
				
			}
			 
			
			else if(opc.equals("2")){
				System.out.println("\n---LISTAGEM DE USUÁRIOS---\n");
				System.out.println("1 - Listar todas as pessoas cadastradas");
				System.out.println("2 - Listar apenas os funcionarios cadastradas");
				System.out.println("3 - Listar apenas os gerentes cadastrados");
				System.out.println("4 - Listar apenas os supervisores cadastrados\n");
				System.out.print("Informe sua opção: ");
				opc = entrada.nextLine();
				
				if (opc.equals("1")) {
					System.out.println("\n---LISTAGEM DE PESSOAS---\n");
					for (Pessoa pessoa : pessoas) {
						System.out.println(pessoa);
					}
				}
				
				else if(opc.equals("2")) {
					System.out.println("\n---LISTAGEM DE FUNCIONÁRIOS---\n");
					for (Pessoa pessoa : pessoas) {
						if (pessoa instanceof Funcionario) {
							System.out.println(pessoa);
						}
					}
				}
				
				else if(opc.equals("3")) {
					System.out.println("\n---LISTAGEM DE GERENTES---\n");
					for (Pessoa pessoa : pessoas) {
						if (pessoa instanceof Gerente) {
							System.out.println(pessoa);
						}
					}
				}
				
				else if(opc.equals("4")) {
					System.out.println("\n---LISTAGEM DE SUPERVISORES---\n");
					for (Pessoa pessoa : pessoas) {
						if (pessoa instanceof Supervisor) {
							System.out.println(pessoa);
						}
					}
				}
				
				
			}
			
			else if(opc.equals("3")) {
				System.out.println("\nObrigado por utilizar o sistema!\n");
				break;
				
			}
			
			else {
				System.out.println("Opção inválida!");
			}
			
			
		}

	}

}
