package lista_FortBrasil;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String telefone = "";
		int n;

		System.out.print("Quantos numeros de telefone deseja digitar? ");
		n = sc.nextInt();
		String[] telefones = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "º Telefone: ");
			telefone = sc.next();
			telefones[i] = telefone;

		}
		int count = 0;
		for (int i = 0; i < telefone.length(); i++) {
			if (telefones[0].charAt(i) == telefones[1].charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}
}
