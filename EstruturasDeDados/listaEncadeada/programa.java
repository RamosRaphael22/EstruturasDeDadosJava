package estudo;

public class programa {

	public static void main(String[] args) {
		
		listaEncadeada lista = new listaEncadeada();
		
		//adicionar elementos
		
		lista.adicionar("AC");
		lista.adicionar("BA");
		lista.adicionar("CE");
		lista.adicionar("DF");
		lista.adicionar("PE");
		System.out.println("tamanho: " + lista.getTamanho());	
		System.out.println("primero: " + lista.getPrimeiro().getValor());
		System.out.println("ultimo: " + lista.getUltimo().getValor());
		 
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		 
		//remover elementos
		
		lista.remover("AC");
		lista.remover("BA");
		lista.remover("CE");
		lista.remover("DF");
		lista.remover("PE");
		
		for(int i=0; i<lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
		System.out.println("tamanho da lista apos remoçao: " + lista.getTamanho());
	}

}
