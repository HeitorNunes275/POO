package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao235 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Faixa Solid�ria! Insira as informa��es abaixo.\n");
		System.out.print("Quil�metros totais dirigidos por dia: ");
		double a = input.nextDouble();
		System.out.print("Pre�o por litro de gasolina: ");
		double b = input.nextDouble();
		System.out.print("Quil�metros m�dios por dia: ");
		double c = input.nextDouble();
		System.out.print("Taxas de estacionamento por dia: ");
		double d = input.nextDouble();
		System.out.print("Ped�gio por dia: ");
		double e = input.nextDouble();
		System.out.println("\nAderindo a faixa solid�ria, voc� pagar�:\n");
		System.out.printf("Quil�metros totais dirigidos por dia: R$%.2f (Economia de R$%.2f)\n", a-(a*0.2), a*0.2);
		System.out.printf("Pre�o por litro de gasolina: R$%.2f (Economia de R$%.2f)\n", b-(b*0.2), b*0.2);
		System.out.printf("Quil�metros m�dios por dia: R$%.2f (Economia de R$%.2f)\n", c-(c*0.2), c*0.2);
		System.out.printf("Taxas de estacionamento por dia: R$%.2f (Economia de R$%.2f)\n", d-(d*0.2), d*0.2);
		System.out.printf("Ped�gio por dia: R$%.2f (Economia de R$%.2f)", e-(e*0.2), e*0.2);
	}
}