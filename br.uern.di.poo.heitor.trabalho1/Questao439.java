package br.uern.di.poo.heitor.trabalho1;

public class Questao439 {

	public static void main(String[] args) {
		double a = 7.8;
		System.out.println("Ano	Popula��o mundial esperada	Aumento num�rico na popula��o mundial");
		for (int i = 1; i < 75; i++) {
			System.out.printf("%d		%.2f bilh�es		Aproximadamente %.2f bilh�es\n",i,a,a*0.009);
			a = a+(a*0.009);
		}
		System.out.printf("\nPopula��o dobraria entre o ano 78 e 79.");
	}

}

//Fonte: https://www.istoedinheiro.com.br/populacao-mundial-aumentou-74-milhoes-este-ano/
//Parti da premissa que o Ano 1 tem 7,8 bilh�es de pessoas com um crescimento anual de 0,9%