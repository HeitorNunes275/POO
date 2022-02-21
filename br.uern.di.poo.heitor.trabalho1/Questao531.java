package br.uern.di.poo.heitor.trabalho1;
import java.util.Scanner;
public class Questao531 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int acertos = 0;
		System.out.printf("Question�rio sobre o Aquecimento Global!\n\n");
		System.out.println("01 - O aquecimento � consequ�ncia da intensifica��o de qual fen�meno natural do planeta?");
		System.out.println("1) Destrui��o da camada de oz�nio");
		System.out.println("2) Chuva �cida");
		System.out.println("3) Efeito estufa");
		System.out.println("4) Eutrofiza��o");
		int q = input.nextInt();
		if (q == 3) {
			acertos++;
		}
		System.out.println("\n02 - Cientistas acreditam que o reflorestamento e o plantio de �rvores em �reas sem vegeta��o podem "
				+ "contribuir para minimizar o aquecimento global. "
				+ "A redu��o desse aquecimento ocorreria porque:");
		System.out.println("1) diminuiria a quantidade de di�xido de carbono na atmosfera, "
				+ "que seria utilizado pela fotoss�ntese.");
		System.out.println("2) diminuiria o efeito estufa, com a libera��o de g�s carb�nico, "
				+ "em decorr�ncia da expans�o da cobertura vegetal.");
		System.out.println("3) a expans�o das florestas seria inibida, em longo prazo, "
				+ "pelo excesso de g�s carb�nico liberado.");
		System.out.println("4) aumentaria a quantidade de di�xido de carbono na atmosfera, "
				+ "liberado pela respira��o celular.");
		q = input.nextInt();
		if (q == 1) {
			acertos++;
		}
		System.out.println("\n03 - O excesso de g�s carb�nico produzido por atividades humanas pode:");
		System.out.println("1) intensificar a eutrofiza��o nos oceanos e diminuir a taxa de g�s oxig�nio dissolvido na �gua. "
				+ "Isso provoca a morte dos corais.");
		System.out.println("2) aumentar a temperatura da �gua e, com isso, as c�lulas do animal come�am a se desintegrar e "
				+ "n�o conseguem manter o esqueleto de fosfato de c�lcio resistente.");
		System.out.println("3) reagir com gases sulf�dricos e formar a chuva �cida. "
				+ "A mudan�a no pH da �gua provoca a destrui��o dos endoesqueletos dos corais.");
		System.out.println("4) ser absorvido pelos oceanos e formar o �cido carb�nico, que pode dissolver o esqueleto dos corais. "
				+ "Isso ocasionar� a perda da sustenta��o do animal.");
		q = input.nextInt();
		if (q == 4) {
			acertos++;
		}
		System.out.println("\n04 - Quanto ao efeito estufa, est� INCORRETO o que se afirma em:");
		System.out.println("1) Sua concentra��o na atmosfera impossibilita que o calor seja irradiado, aquecendo a superf�cie terrestre, "
				+ "elevando as temperaturas.");
		System.out.println("2) O uso de energias renov�veis � uma das atividades que "
				+ "mais produzem gases de efeito estufa.");
		System.out.println("3) � um fen�meno atmosf�rico.");
		System.out.println("4) O g�s metano � o segundo maior contribuinte para o aumento das temperaturas da Terra.");
		q = input.nextInt();
		if (q == 2) {
			acertos++;
		}
		System.out.println("\n05 - Assinale a op��o que define corretamente o fen�meno do Aquecimento Global:");
		System.out.println("1) O Aquecimento Global corresponde a uma �rea onde h� muitos terremotos e uma forte atividade vulc�nica, "
				+ "localizado no Norte do Oceano Pac�fico.");
		System.out.println("2) O Aquecimento Global � o processo de derretimento das geleiras do �rtico "
				+ "e da Ant�rtida que acabam por elevar o n�vel dos oceanos.");
		System.out.println("3) O Aquecimento Global corresponde ao aumento da temperatura m�dia do planeta Terra, "
				+ "causado pelo ac�mulo de gases poluentes na atmosfera.");
		
		System.out.println("4)  O Aquecimento Global corresponde � cobertura de g�s oz�nio presente na atmosfera terrestre que "
				+ "protege o planeta das radia��es ultravioletas prejudiciais aos seres vivos.");
		q = input.nextInt();
		if (q == 3) {
			acertos++;
		}
		if (acertos == 5) {
			System.out.println("Excelente!");
		}
		if (acertos == 4) {
			System.out.println("Muito bom!");
		}
		if (acertos <= 3) {
			System.out.println("� o momento de aprimorar seu conhecimento sobre o Aquecimento Global!");
		}
		System.out.println("\nFontes:\nhttps://www.questoesestrategicas.com.br/questoes/busca/assunto/aquecimento-global1\n"
				+ "https://exercicios.mundoeducacao.uol.com.br/exercicios-biologia/exercicios-sobre-aquecimento-global-biodiversidade.htm");
	}
}