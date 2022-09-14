package br.imd.ufrn.main;

import java.util.Scanner;

import br.imd.ufrn.dominio.Banco;
import br.imd.ufrn.dominio.Conta;

public class Main {

	public static void main(String[] args) {
		
		Conta xico = new Conta();
		
		//xico.setTitular("Fran Xico");
		xico.setNumConta("01");
		xico.Deposito(200);
		
		Conta francisca = new Conta();
		//francisca.setTitular("Francisca das Dores");
		francisca.setNumConta("02");
		francisca.Deposito(300);
		
		Banco santander = new Banco();
		santander.addConta(xico);
		santander.addConta(francisca);
		
		for(Conta d: santander.listarContas()) {
			System.err.println(d);
		}
		
		Scanner sc = new Scanner(System.in);
		try {
			while (true) {
				System.out
						.println("Digite a opção desejada: \n" 
						+ "1 - Novo cliente \n" 
						+ "2 - Escolher Banco \n"
						+ "3 - Escolher Agencia \n"
						+ "4 - Criar Conta \n"
						+ "5 - Realizar saque \n"
						+ "6 - Realizar depósito \n"
						+ "7 - Fechar conta \n"
						+ "8 - opções \n"
						+ "0 - Sair");
				int opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 1:
					System.out.println("Digite o nome do Cliente:");
					String nome = sc.nextLine();
					Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 2:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 3:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 4:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 5:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 6:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 7:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;
				case 8:
					System.out.println("Digite o nome do Cliente:");
					//String nome = sc.nextLine();
					//Conta c = new Conta();
					//c.setTitular(nome);
					break;				
				case 0:
					System.exit(0);
				}

			}
		} finally {
			sc.close();
		}
		
		
		//System.out.println(xico);
	}

}
