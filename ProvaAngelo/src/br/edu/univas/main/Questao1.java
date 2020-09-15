package br.edu.univas.main;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int notas[] = new int[10];
		for (int i = 0; i < 10; i++) {
			notas[i] = leitura.nextInt();
		}
		int nFinal[] = fn(notas);
		int count = 0;
		for (int i = 1; i < 20; i = i + 2) {
			if (nFinal[i] == 1)
				count++;
		}
		System.out.println(count);
		leitura.close();
	}

	public static int[] fn(int[] notas) {
		int notasModificadas[] = new int[10];
		int nFinal[] = new int[20];
		for (int i = 0; i < 10; i++) {
			if (notas[i] < 60) {
				notasModificadas[i] = 0;
			} else {
				notasModificadas[i] = 1;
			}
		}
		int p = 0;
		for (int i = 0; i < 10; i++) {
			nFinal[p] = notas[i];
			p = p + 2;
		}
		p = 1;
		for (int i = 0; i < 10; i++) {
			nFinal[p] = notasModificadas[i];
			p = p + 2;
		}
		return nFinal;
	}
}
