//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner Leitor = new Scanner(System.in);
//
//		// variaveis declaradas
//		String nome;
//		String agencia;
//		String cpf;
//		double valorcc;
//		double tipodetransacao = 0;
//		double deposito;
//		double saque;
//		double transferencia;
//
//		// metodo pra gravar nas variaveis
//		System.out.printf("Nome: ");
//		nome = (Leitor.next());
//		System.out.printf("Agencia: ");
//		agencia = (Leitor.next());
//		System.out.printf("CPF: ");
//		cpf = (Leitor.next());
//		System.out.printf("Valor na Conta: ");
//		valorcc = (Leitor.nextDouble());
//		System.out.printf("Transações disponiveis: 1 para deposito - 2 para saque - 3 para transferencia: ");
//		tipodetransacao = (Leitor.nextDouble());
//
//		// metodo de deposito
//		if (tipodetransacao == 1) {
//			System.out.printf("insira o valor do deposito: ");
//			deposito = (Leitor.nextDouble());
//			if (deposito >= 0) {
//				valorcc = valorcc + deposito;
//				System.out.printf("Novo valor da cc: " + valorcc);
//			}
//
//			// metodo de saque
//			if (tipodetransacao == 2) {
//				System.out.printf("insira o valor do saque: ");
//				saque = (Leitor.nextDouble());
//				valorcc = valorcc - saque;
//				System.out.printf("Novo valor da cc: " + valorcc);
//			}
//
//			// metodo de tranferencia
//			if (tipodetransacao == 3) {
//				System.out.printf("insira o valor da tranferencia: ");
//				transferencia = (Leitor.nextDouble());
//				valorcc = valorcc - transferencia;
//				System.out.printf("Novo valor da cc: " + valorcc);
//			}
//
//		}
//	}
//}
