package estudo;

import java.util.Scanner;

public class buscaLinear {

	public static void main(String[] args) {
		
		String[] estados = new String[5];
		
		estados[0]="BA";
		estados[1]="PE";
		estados[2]="PB";
		estados[3]="SP";
		estados[4]="RJ";
		
		for(int i=0; i<estados.length; i++) {
			System.out.println("Estado " + i + ": " + estados[i]);
		}
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("qual a sigla?");
		String siglabusca = leitor.nextLine();
		
		boolean encontrou = false;
		for(int i=0; i < estados.length; i++) {
			String elemento = estados[i];
			if (elemento.equals(siglabusca)) {
				encontrou=true;
				break;
			}
		}
		if (encontrou == true) {
			System.out.println("sucesso!");
		}else {
			System.out.println("falha!");
		}
		
	}

}
