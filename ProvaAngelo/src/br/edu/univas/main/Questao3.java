package br.edu.univas.main;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		String entrada = leitura.nextLine();
		String v1[] = new String[entrada.length()];
		String v2[] = new String[entrada.length()];

		for (int i = 0; i < entrada.length(); i++) {
			v1[i] = entrada.substring(i, i++);
			v2[i] = entrada.substring(i, i++);
		}

		if (aux(entrada)) {
			System.out.println("é palindome");
		} else {
			System.out.println("`não é palindome");
		}
	}

	public static boolean aux(String entrada, String v1[], String v2[]) {
		boolean verifica = true;
		for (int i = 0; i < entrada.length(); i++) {
			int aux = entrada.length();
			if (v1[i] == v2[aux]) {
				verifica = true;
			} else {
				return false;
			}
		}
		return verifica;
	}
}