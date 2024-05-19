package ContaBanco;

import java.util.Scanner;

import javax.sound.sampled.Port;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeroConta;
		String agenciaConta;
		String nomeCliente;
		double saldoConta = 237.48;
		System.out.println("Por favor digite seu Nome: ");
		nomeCliente = input.next();
		System.out.println("Por favor digite o numero de sua Conta: ");
		numeroConta = input.nextInt();
		System.out.println("Por favor digite o numero de sua Agencia: ");
		agenciaConta = input.next();
		System.out.println("Olá" +" "+ nomeCliente +","
		+ "obrigado por criar uma conta em nosso banco, sua agência é" + " " + " " + agenciaConta + " Conta: "
        + " " + numeroConta + " " + "e o seu saldo é de: R$: " + saldoConta);
		
		
	}
	

}
