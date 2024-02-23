	package br.com.tbiazin;

	public class CalculaMedia {
		
	public static void main(String args[]) {
		int Tiago = 10;
		int Paloma = 8;
		int Rose = 4;
		int Ruan = 6;
		
		int[] valores = {Tiago, Paloma, Rose, Ruan};
		
		int soma = 0;
		
		for (int valor : valores) {
			soma += valor;
		}
		
		double media = (double) soma / valores.length;
		
		System.out.println("**** Média dos valores: ****" + media);
		
	}

	}
