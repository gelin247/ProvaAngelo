package br.edu.univas.main;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite uma palavra abaixo:");
		String palavra = leitura.nextLine();
		System.out.println("A palavra ao contrario " + palavra + " é " + avralap(palavra));
		leitura.close();
	}

	public static String avralap(String palavra) {
		String avralap = "";
		for (int i = palavra.length() - 1; i >= 0; --i) {
			avralap += palavra.charAt(i);
		}
		return avralap;
	}

}
