package estudo;

public class programa {

	public static void main(String[] args) {

		listaEncadeada lista = new listaEncadeada();
		 lista.adicionar("AC");
		 lista.adicionar("BA");
		 lista.adicionar("CE");
		 lista.adicionar("DF");
		 lista.adicionar("PE");
		 System.out.println("tamanho: " + lista.getTamanho());	
		 System.out.println("primero: " + lista.getPrimeiro().getValor());
		 System.out.println("ultimo: " + lista.getUltimo().getValor());
		 System.out.println(lista.get(0).getValor());
		 System.out.println(lista.get(1).getValor());
		 System.out.println(lista.get(2).getValor());
		 System.out.println(lista.get(3).getValor());
		 System.out.println(lista.get(4).getValor());
	}

}
